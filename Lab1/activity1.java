import java.util.Scanner;

public class activity1 {
    /*  Number Conversion */
    public static void main(String[] args) {
        System.out.println("Enter Hexadec Number: ");
        Scanner input = new Scanner(System.in);

        String hex = input.next();
        int decimal = Integer.parseInt(hex, 16);
        System.out.println("Decimal Number: " + decimal);

        // Converting hexadecimal to binary
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary Number: " + binary);

        // Converting hexadecimal to octal
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal Number: " + octal);

        input.close();
    }
}