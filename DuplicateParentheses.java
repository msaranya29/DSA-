import java.util.Stack;

public class DuplicateParentheses { //O(n)
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
    public static boolean hasDuplicateParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == ')'){
                int count = 0;
                while (stack.peek() != '(') {
                    stack.pop();
                    count++;
                }
                if (count < 1) {
                    return true; // Duplicate parentheses found
                }else {
                    stack.pop(); // Pop the '('
                }


            }
            else {
                stack.push(c);
            }
        }
        return false; 
    }

    public static void main(String[] args) {
        String s = "((a+b))";
        String s2 = "(a-b)";
        System.out.println(hasDuplicateParentheses(s));
        System.out.println(hasDuplicateParentheses(s2)); // true
    }
}
