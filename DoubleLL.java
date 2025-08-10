public class DoubleLL {
    public class Node {
        int data;
        Node next;
        Node prev; 
        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    //add first
    public void addFirst(int data) {
        
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode; 
        head = newNode;
    }
    public void printList() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    //remove first
    public int removeFirst() {
        if(head == null) {
            System.out.println("List is empty");
            return -1;
        } 
        size--;
        int val=head.data; 
        if(head == tail) {
            head = tail = null;
            
        }else{
        
        head = head.next;
        head.prev = null;
    }
        return val; // Update the new head's previous pointer
    }

    public void reverse(){
        Node prev = null;
        Node current = tail=head; // Update tail to the current head
        Node next;
        while (current != null) {
            next = current.next; // Store next node
            current.next = prev;
            current.prev=next; // Reverse the link
            prev = current; // Move prev to current
            current = next; // Move to next node
        }
        head = prev; // Update head to the new first node
    }


    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(10);
        dll.addFirst(20);
        dll.addFirst(30);
        dll.printList(); 
        System.out.println("Size of the list: " + size);
        System.out.println("Elment removed from the front." + dll.removeFirst());
        System.out.println("Size of the list after removal: " + size);
        dll.printList();
        dll.reverse();
        System.out.println("List after reversal:");
        dll.printList();
    
    }



}
