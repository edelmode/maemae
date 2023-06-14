import java.util.Scanner;

public class StackBasic {
    private int maxSize;
    private int top;
    private int[] stackArray;
    
    // Constructor
    public StackBasic(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // initially stack is empty
    }
    
    // Add element to top of stack
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push element.");
            return;
        }
        top++;
        stackArray[top] = value;
    }
    
    // Remove element from top of stack
    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop element.");
            return;
        }
        top--;
    }
    
    // Return top of stack
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty. No element to peek.");
            return -1;
        }
        return stackArray[top];
    }
    
    public static void main(String args[]) {
        System.out.println("Welcome to Stack Basic!");
        System.out.println("====================================");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();
        
        StackBasic stack = new StackBasic(size);
        
        System.out.println("Enter stack elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            int element = scanner.nextInt();
            stack.push(element);
        }
        
        System.out.println("Top element: " + stack.peek());
        
        String choice = "Y";
        while (stack.peek() != -1 && choice.equalsIgnoreCase("Y")) {
            System.out.print("Do you want to pop an element? (Y/N): ");
            choice = scanner.next();
            
            if (choice.equalsIgnoreCase("Y")) {
                stack.pop();
                System.out.println("Element popped.");
                System.out.println("Top element: " + stack.peek());
            }
        }
        
        if (stack.peek() == -1) {
            System.out.print("Stack is empty. Do you want to push an element? (Y/N): ");
            choice = scanner.next();
        }
        
        while (choice.equalsIgnoreCase("Y")) {
            if (stack.top == stack.maxSize - 1) {
                System.out.println("Stack is full. Cannot push element.");
                break;
            }
            
            System.out.print("Enter element to push: ");
            int element = scanner.nextInt();
            stack.push(element);
            
            System.out.println("Top element: " + stack.peek());
            
            if (stack.top == stack.maxSize - 1) {
                System.out.println("Stack is full. Cannot push more elements.");
                break;
            }
            
            System.out.print("Do you want to push another element? (Y/N): ");
            choice = scanner.next();
        }
        
        scanner.close();
    }
}