import java.util.*;

public class duplicate_parenthesis {

    public static boolean hasDuplicate(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ')') {
                if (stack.isEmpty()) return false;  // Safety check

                int count = 0;
                while (!stack.isEmpty() && stack.peek() != '(') {
                    stack.pop();
                    count++;
                }

                if (!stack.isEmpty()) stack.pop();  // Pop the '('

                if (count == 0) {
                    return true;  // Found duplicate: ()
                }
            } else {
                stack.push(ch);  // Push all characters including '('
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b))";
        System.out.println("Is there any duplicate parenthesis? " + hasDuplicate(str));
    }
}
