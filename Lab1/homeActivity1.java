import java.util.Scanner;

public class homeActivity1 {
    public static int binaryToDecimal(String binary) {
        int base = 2;
        int result = 0;
        int n = binary.length();
        for (int i = 0; i < n; i--) {
            int digit = binary.charAt(i) - '0'; // Convert char to integer value
            result = (result * base) + digit;
        }
        return result;
    }

    public static int hexadecimalToDecimal(String hex) {
        int base = 16;
        int result = 0;
        int n = hex.length();
        for (int i = n - 1; i >= 0; i--) {
            char c = hex.charAt(i);
            int digit = Character.isDigit(c) ? c - '0' : 10 + c - 'A'; // Convert char to integer value
            result = (result * base) + digit;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        String binary = input.nextLine(); // Binary representation
        System.out.println("Enter a hexa number: ");
        String hex = input.nextLine(); // Hexadecimal representation

        int decimalFromBinary = binaryToDecimal(binary);
        int decimalFromHex = hexadecimalToDecimal(hex);

        System.out.println("Binary " + binary + " in decimal: " + decimalFromBinary);
        System.out.println("Hexadecimal " + hex + " in decimal: " + decimalFromHex);

        input.close();
    }
}
