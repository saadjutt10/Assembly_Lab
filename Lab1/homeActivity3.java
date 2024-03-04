import java.util.Scanner;

public class homeActivity3 {
    public static double binaryToDecimal(String binary) {
        if (!isValidBinary(binary)) {
            throw new IllegalArgumentException("Invalid binary number: " + binary);
        }

        int n = binary.length();
        double decimalValue = 0.0;

        int decimalIndex = binary.indexOf('.');
        int integerPartLength = decimalIndex == -1 ? n : decimalIndex;

        for (int i = integerPartLength - 1; i >= 0; i--) {
            int digit = binary.charAt(i) - '0';
            decimalValue += digit * Math.pow(2, integerPartLength - i - 1);
        }

        if (decimalIndex != -1) {
            for (int i = decimalIndex + 1; i < n; i++) {
                int digit = binary.charAt(i) - '0';
                decimalValue += digit * Math.pow(2, decimalIndex - i);
            }
        }

        return decimalValue;
    }

    public static boolean isValidBinary(String binary) {
        for (char c : binary.toCharArray()) {
            if (c != '0' && c != '1' && c != '.') {
                return false;
            }
        }
        // If the binary string contains more than one decimal point
        if (binary.chars().filter(ch -> ch == '.').count() > 1) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a fractional binary number: ");
        String binary = input.nextLine();

        if (!isValidBinary(binary)) {
            System.out.println("Invalid binary number. Please enter a valid binary number.");
        } else {
            double decimalValue = binaryToDecimal(binary);
            System.out.println("Binary " + binary + " in decimal: " + decimalValue);
        }

        input.close();
    }

}
