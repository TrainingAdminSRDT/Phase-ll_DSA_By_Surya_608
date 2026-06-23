import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(11);
        stack.push(15);
        stack.push(99);

        stack.pop();

        stack.push(77);

        stack.pop();
        stack.pop(); 

        System.out.println(stack.peek()); 