import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.println("Welcome to Binary to Decimal Converter!");
        System.out.println("====================================");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        List<String> binaryNumbers = new ArrayList<>();

        System.out.print("Enter the number of binary numbers: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // Clear the newline character from the input buffer

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter binary number #" + i + ": ");
            String binary = scanner.nextLine();
            binaryNumbers.add(binary);
        }


        System.out.println();
        System.out.println("Decimal equivalents:");

        for (String binary : binaryNumbers) {
            int decimal = binaryToDecimal(binary);
            System.out.println(binary + " -> " + decimal);
        }
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            int digit = binary.charAt(i) - '0';
            decimal += digit * Math.pow(2, power);
            power++;
        }

        return decimal;
    }
}