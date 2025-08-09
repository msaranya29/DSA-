public class ReverseLL {
    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++
;        if(head == null){
            head=tail=new Node(data);
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        size++
;        if(head == null){
            head=tail=new Node(data);
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void printList(){
    if(head == null){
        System.out.println("List is empty");
    return;}
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void reverse(){
        Node prev = null;
        Node current = tail=head; // Update tail to the current head
        Node next;
        while (current != null) {
            next = current.next; // Store next node
            current.next = prev; // Reverse the link
            prev = current; // Move prev to current
            current = next; // Move to next node
        }
        head = prev; // Update head to the new first node
    }

    public void deleteNthFromEnd(int n) {
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;
            return;
        }
        int i=1;
        int iToFind=sz-n;
        Node prev=head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next = prev.next.next; 
        return;
            
    }
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow; 
    
    }

    public boolean isPalindrome() {
        if(head==null || head.next==null){
            return true;
        }
        // Find the middle of the linked list
        Node mid = findMid(head);
        // Reverse the second half of the linked list
        Node prev = null;
        Node current = mid;
        Node next;
        while (current != null) {
            next = current.next; // Store next node
            current.next = prev; // Reverse the link
            prev = current; // Move prev to current
            current = next; // Move to next node
        }
        Node right= prev; // This is the head of the reversed second half
        Node left = head; // This is the head of the first half
        while (right != null) {
            if (left.data != right.data) {
                return false; // Not a palindrome
            }
            left = left.next;
            right = right.next; 
        }
        return true; 
    }

    public boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true; // Cycle detected
            }
        }
    }
    public static void main(String[] args) {
        /*ReverseLL ll = new ReverseLL(); 
        //ll.addFirst(2);
        //ll.addFirst(1);
        //ll.addLast(3);
        ll.addLast(4);
        ll.printList();
        //ll.add(2, 9);
        //ll.printList();
        ll.reverse();
        ll.printList();
        ll.deleteNthFromEnd(2);
        System.out.println("After deleting 2nd node from end:");
        ll.printList();
        System.out.println();*/
                
        ReverseLL ll2 = new ReverseLL();
    ll2.addFirst(1);
    ll2.addLast(2);
    ll2.addLast(2);
    ll2.addLast(1);
    System.out.println("Linked List:");
    ll2.printList(); 
    System.out.println("Is Palindrome? " + ll2.isPalindrome()); // Should return true
    }
}
