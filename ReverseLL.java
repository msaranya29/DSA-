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

    public static void main(String[] args) {
        ReverseLL ll = new ReverseLL(); 
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.printList();
        //ll.add(2, 9);
        //ll.printList();
        ll.reverse();
        ll.printList();
        ll.deleteNthFromEnd(2);
        System.out.println("After deleting 2nd node from end:");
        ll.printList();
    }
}
