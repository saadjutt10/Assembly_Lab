import java.util.Scanner;

public class activity2 {
    public static void main(String[] args) {
        // Binary to decimal
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        int binary = input.nextInt();
        int decimal = 0;
        int power = 0;
        while (binary != 0) {
            int digit = binary % 10;
            decimal += digit * Math.pow(2, power);
            binary /= 10;
            power++;
        }
        System.out.println("The decimal value is: " + decimal);

        input.close();        
    }
}
