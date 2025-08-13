import java.util.Stack;

public class ValidParentheses { //O(n)
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                
                if ((stack.peek() == '(' && c == ')') ||
                    (stack.peek() == '{' && c == '}') ||
                    (stack.peek() == '[' && c == ']')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "({[]}])";
        System.out.println(isValid(s)); // true
    }
}
