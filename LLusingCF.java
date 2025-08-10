import java.util.LinkedList;
public class LLusingCF {
    public static void main(String[] args){
    //create
    LinkedList<Integer> ll = new LinkedList<>();

    //add elements to the linked list
    ll.addLast(1);
    ll.addLast(2);
    ll.addFirst(0);
//Print the linked list
    System.out.println("Linked List: " + ll);
    //remove elements from the linked list
    ll.removeFirst();
    ll.removeLast();
    System.out.println("Linked List after removing elements: " + ll);
    }

}
