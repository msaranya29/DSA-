import java.util.Stack;
public class Queue_2Stack {
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
        public static boolean isEmpty() {
            return s1.isEmpty();
        }
        public static void add(int data) {
            // Push onto stack 1
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
           while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public static int remove() {
            // Remove from stack 1
            if(isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return s1.pop();
        }
        public static int peek() {
            // Peek at the top of stack 1
            if(isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
