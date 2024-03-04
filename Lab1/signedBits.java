public class signedBits {
    public static String addSignedBits(String a, String b) {
        // Convert strings to character arrays
        char[] num1 = a.toCharArray();
        char[] num2 = b.toCharArray();

        // Perform addition
        int carry = 0;
        StringBuilder result = new StringBuilder();
        for (int i = num1.length - 1; i >= 0; i--) {
            int bit1 = Character.getNumericValue(num1[i]);
            int bit2 = Character.getNumericValue(num2[i]);

            // Calculate sum
            int sum = bit1 + bit2 + carry;

            // Determine the result bit
            int resultBit = sum % 2;

            // Determine carry
            carry = sum / 2;

            // Append result bit
            result.insert(0, resultBit);
        }

        // Check for overflow
        boolean overflow = (carry != 0) || (num1[0] == '1' && num2[0] == '1' && result.charAt(0) == '0')
                || (num1[0] == '0' && num2[0] == '0' && result.charAt(0) == '1');

        // Handle overflow
        if (overflow) {
            result.insert(0, '1'); // Set the sign bit to 1 to indicate overflow
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String a = "0101"; // Signed binary representation of 5
        String b = "1011"; // Signed binary representation of -5
        String sum = addSignedBits(a, b);
        System.out.println("Sum: " + sum);
    }
}
