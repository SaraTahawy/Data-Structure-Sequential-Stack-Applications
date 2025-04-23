import java.util.Scanner;
 
public class BalancedParentheses {
    private static final int MAX = 80;
 
    private static class Stack {
        private char[] data;
        private int top;
 
        public Stack() {
            data = new char[MAX];
            top = -1;
        }
 
        public boolean isEmpty() {
            return top == -1;
        }
 
        public boolean isFull() {
            return top == MAX - 1;
        }
 
        public void push(char c) {
            if (!isFull()) {
                top++;
                data[top] = c;
            }
        }
 
        public void pop() {
            if (!isEmpty()) {
                top--;
            }
        }
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        while (true) {
            System.out.print("Enter input: ");
            String input = scanner.nextLine();
 
            if (input.isEmpty()) {
                break;
            }
 
            char[] characters = input.toCharArray();
            Stack stack = new Stack();
            boolean valid = true;
            String result = "";
 
            for (char c : characters) {
                switch (c) {
                    case '(':
                    case '[':
                    case '{':
                        stack.push(c);
                        break;
                    case ')':
                        if (!stack.isEmpty() && stack.data[stack.top] == '(') {
                            stack.pop();
                        } else {
                            valid = false;
                        }
                        break;
                    case ']':
                        if (!stack.isEmpty() && stack.data[stack.top] == '[') {
                            stack.pop();
                        } else {
                            valid = false;
                        }
                        break;
                    case '}':
                        if (!stack.isEmpty() && stack.data[stack.top] == '{') {
                            stack.pop();
                        } else {
                            valid = false;
                        }
                        break;
                    default:
                        valid = false;
                        break;
                }
 
                if (!valid) {
                    break;
                }
            }
 
            if (!valid || !stack.isEmpty()) {
                result = "Not Balanced";
            } else if (valid && stack.isEmpty()) {
                result = "Properly Nested structure";
            }
            // Check for illegal characters
            for (char c : characters) {
                if (c != '(' && c != ')' && c != '[' && c != ']' && c != '{' && c != '}') {
                    result = "Illegal character in input";
                    break;
                }
            }
 
            System.out.println("Input is: " + input);
            System.out.println("Result: " + result);
        }
    }
}