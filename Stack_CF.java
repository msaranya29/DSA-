import java.util.Stack;
public class Stack_CF {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        // Pop elements from the stack
        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
    
}
