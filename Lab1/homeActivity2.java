import java.util.Scanner;

public class homeActivity2 {
    public static String decimalToBinary(int decimal) {
        int base = 2;
        StringBuilder result = new StringBuilder();
        while (decimal != 0) {
            int digit = decimal % base;
            result.insert(0, digit);
            decimal /= base;
        }
        return result.toString();
    }

    public static String decimalToHexadecimal(int decimal) {
        int base = 16;
        StringBuilder result = new StringBuilder();
        while (decimal != 0) {
            int digit = decimal % base;
            char hexDigit = (digit < 10) ? (char) ('0' + digit) : (char) ('A' + digit - 10);
            result.insert(0, hexDigit);
            decimal /= base;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter decimal number: ");
        int decimal = input.nextInt();

        String binary = decimalToBinary(decimal);
        String hexadecimal = decimalToHexadecimal(decimal);

        System.out.println("Decimal " + decimal + " in binary: " + binary);
        System.out.println("Decimal " + decimal + " in hexadecimal: " + hexadecimal);

        input.close();
    }
}
