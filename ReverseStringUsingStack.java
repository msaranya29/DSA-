import java.util.Stack;
public class ReverseStringUsingStack {
    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();
        int idx=0;
        while (idx < str.length()) {
            stack.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            char curr=stack.pop();
            result.append(curr);
        }
        return result.toString();
            

    }
        
        // Push all 
    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversed = reverseString(str);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);

    }
}
