import java.util.Scanner;

public class activity5 {
    public static int countOnes(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n = n >>> 1; // Shift n to the right by 1 bit (unsigned right shift)
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        int result = countOnes(input);
        System.out.println("Number of 1's in binary representation of " + input + ": " + result);
        scanner.close();
    }
}
