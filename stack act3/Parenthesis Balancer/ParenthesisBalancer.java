import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class ParenthesisBalancer {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == '(' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Parenthesis Balancer!");
        System.out.println("====================================");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many sets of parentheses would you like to input? ");
        int numSets = scanner.nextInt();
        scanner.nextLine(); // Clear the newline character

        List<String> parenthesesList = new ArrayList<>();

        for (int i = 1; i <= numSets; i++) {
            System.out.print("Enter parentheses for Set #" + i + ": ");
            String userInput = scanner.nextLine();
            parenthesesList.add(userInput);
        }

        System.out.println(); // Add space before the output

        for (int i = 0; i < parenthesesList.size(); i++) {
            String parentheses = parenthesesList.get(i);

            // Remove non-parenthesis characters
            parentheses = parentheses.replaceAll("[^\\(\\)\\{\\}]", "");

            if (parentheses.isEmpty()) {
                System.out.println("Set #" + (i + 1) + ": NOT BALANCED (No parenthesis found)");
                continue;
            }

            if (isBalanced(parentheses)) {
                System.out.println("Set #" + (i + 1) + ": BALANCED");
            } else {
                System.out.println("Set #" + (i + 1) + ": NOT BALANCED");
            }
        }

        System.out.println();
        System.out.println("Thank you for using the Parenthesis Balancer!");
        System.out.println("Goodbye and have a nice day!");
        System.out.println("====================================");
    }
}