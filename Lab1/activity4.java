import java.util.Scanner;

public class activity4 {
    public static void main(String[] args) {
        // Binary to Hexadecimal
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        String binary = sc.nextLine();
        sc.close();
        int decimal = Integer.parseInt(binary, 2);
        String hexadecimal = Integer.toHexString(decimal);
        System.out.println("Hexadecimal: " + hexadecimal);
        System.out.println("Decimal: " + decimal);
    }
}
