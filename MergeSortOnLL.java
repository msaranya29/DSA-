public class MergeSortOnLL {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // Mid node
    }

    private Node merge(Node left, Node right) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (left != null && right != null) {
            if (left.data < right.data) {
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }

        while (left != null) {
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }

        while (right != null) {
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head; // Base case
        }

        Node mid = getMid(head); // FIXED: pass head here
        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft, newRight);
    }

    // Helper method to add nodes
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Helper method to print list
    public void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeSortOnLL ll = new MergeSortOnLL();
        ll.addLast(4);
        ll.addLast(2);
        ll.addLast(5);
        ll.addLast(1);
        ll.addLast(3);

        System.out.println("Original list:");
        ll.printList(head);

        head = ll.mergeSort(head);

        System.out.println("Sorted list:");
        ll.printList(head);
    }
}
