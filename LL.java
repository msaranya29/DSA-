public class LL {
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
    public void add(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;
        }

        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public int removeFirst(){
        if(size==0){
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        //prev: i=size-2
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=tail.data;
        prev.next=null; //or prev.next.data;
        tail=prev;
        size--;
        return val;
    }
    //  i   terative approach to search in linked list
    public int itrSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1; //not found
    }

    // Recursive search
    public int recSearch(int key) {
        return helper(head, key);
    }

    public int helper(Node head, int key){
        if(head == null){
            return -1; //not found
        }
        if(head.data == key){
            return 0; //found at this node
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1; //not found in the rest of the list
        }
        return idx + 1; //found in the rest of the list, return index relative to this node
    }



    public static void main(String[] args) {
        LL ll=new LL();
        ll.printList();  
        ll.addFirst(2);
        ll.printList();
        ll.addFirst(1);
        ll.printList();
        ll.addLast(3);
        ll.printList();
        ll.addLast(4);
        ll.printList();
        ll.add(2, 9);
        ll.printList();
        System.out.println("Size of the linked list: " + size);
        System.out.println("Removed first element: " + ll.removeFirst());
        System.out.println("Removed last element: " + ll.removeLast());
        System.out.print("Updated linked list after removals: ");
        ll.printList();
        System.out.println("Searching for 3 (Display Index): " + ll.itrSearch(3));
        System.out.println("Searching for 5 (Display Index): " + ll.itrSearch(5));
        System.out.println("Recursive search for 2 (Display Index): " + ll.recSearch(2));
        System.out.println("Recursive search for 5 (Display Index): " + ll.recSearch(5));
    }
}
