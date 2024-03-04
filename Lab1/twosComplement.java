public class twosComplement {
    public static String twosComp(String binaryNumber) {
        // Invert all the bits
        StringBuilder inverted = new StringBuilder();
        for (int i = 0; i < binaryNumber.length(); i++) {
            char bit = binaryNumber.charAt(i);
            inverted.append(bit == '0' ? '1' : '0');
        }

        // Add 1 to the result
        StringBuilder result = new StringBuilder();
        boolean carry = true;
        for (int i = inverted.length() - 1; i >= 0; i--) {
            char bit = inverted.charAt(i);
            if (bit == '1' && carry) {
                result.insert(0, '0');
            } else if (bit == '0' && carry) {
                result.insert(0, '1');
                carry = false;
            } else {
                result.insert(0, bit);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String binaryNumber = "110101";
        String twosComplement = twosComp(binaryNumber);
        System.out.println("Two's complement: " + twosComplement);
    }
}
