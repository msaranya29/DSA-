public class LinkedListCycle {
    static Node head; 

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Detect cycle using Floyd’s algorithm
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;         // Move slow by 1
            fast = fast.next.next;    // Move fast by 2

            if (slow == fast) {
                return true; // Cycle detected
            }
        }
        return false; // No cycle
    }
    public static void removeCycle(){
        Node slow = head;
        Node fast = head;
        boolean cycle=false;

        // Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cycle = true; 
                break; // Cycle detected
            }
        }

        // If no cycle found
        if (cycle == false) {
            return; 
        }
        // find meeting point
        slow = head; 
        Node prev= null;
        while (slow != fast) {
            prev = fast; // Keep track of the previous node
            slow = slow.next; // Move slow by 1
            fast = fast.next; // Move fast by 1
        }
        //remove cycle
        prev.next=null;
            

        
    }

public static void main(String[] args) {
    head = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);

    head.next = second;
    second.next = third;
    third.next = second; // Creates cycle starting at 'second' instead of head

    // 1 → 2 → 3 → 2 ...
    System.out.println(isCycle()); 
    removeCycle();
    System.out.println(isCycle()); 
}
}
