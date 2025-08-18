import java.util.*;

public class Stack_withQueue {

    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        // Check if empty
        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // Push operation
        public static void push(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        // Pop operation
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return -1;
            }

            int top = -1;

            // Case 1: q1 has elements
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()) {
                        break;
                    }
                    q2.add(top);
                }
            }
            // Case 2: q2 has elements
            else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }
            }

            return top;
        }

        // Peek operation
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return -1;
            }

            int top = -1;

            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }

            return top;
        }
    }

    // Testing
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top element: " + s.peek()); // 30
        System.out.println("Popped: " + s.pop());       // 30
        System.out.println("Popped: " + s.pop());       // 20
        System.out.println("Top element: " + s.peek()); // 10
        System.out.println("Popped: " + s.pop());       // 10
        System.out.println("Popped: " + s.pop());       // Stack is empty!
    }
}
