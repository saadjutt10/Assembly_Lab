import java.util.Scanner;

public class activity3 {
    public static void main(String[] args) {
        // Conversion Binary Octal
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int binary = input.nextInt();
        int octal = 0;
        int power = 0;
        while (binary > 0) {
            octal += (binary % 10) * Math.pow(2, power);
            binary /= 10;
            power += 1;
        }
        String oct = Integer.toOctalString(octal);
        System.out.println("The octal value is: " + oct);

        input.close();
    }
}
