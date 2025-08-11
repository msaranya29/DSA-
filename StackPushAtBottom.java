import java.util.Stack;
public class StackPushAtBottom {
    public static void pushAtBottom(Stack<Integer> stack, int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }
        
        int top = stack.pop();
        pushAtBottom(stack, data);
        stack.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        pushAtBottom(stack,4);
        // Pop elements from the stack
        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
