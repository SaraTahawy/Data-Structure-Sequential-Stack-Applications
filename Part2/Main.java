import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();

        System.out.println("Enter input string: ");
        String input = scanner.nextLine();

        System.out.println("Input String is: ");
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
            System.out.print(input.charAt(i) + " ");
        }
        System.out.println();

        System.out.println("Inverted String is: ");
        while (!stack.isEmpty()) {
            char c = stack.pop();
            System.out.print(c + " ");
        }
        System.out.println();
    }}