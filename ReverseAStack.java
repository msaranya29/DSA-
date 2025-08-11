import java.util.Stack;

public class ReverseAStack {
    public static void pushAtBottom(Stack<Integer> stack, int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int top = stack.pop();
        pushAtBottom(stack, data);
        stack.push(top);
    }

    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int top = stack.pop();
        reverseStack(stack);
        pushAtBottom(stack, top);
    }

    public static void printStack(Stack<Integer> stack) {
        // Just iterate without popping (to preserve data)
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        // Push elements
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Original Stack:");
        printStack(s);

        reverseStack(s);

        System.out.println("Reversed Stack:");
        printStack(s);
    }
}

