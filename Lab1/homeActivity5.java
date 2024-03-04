public class homeActivity5 {
    public static void main(String[] args) {
        double value = 10.625;

        int integerPart = (int) value;
        double fractionalPart = value - integerPart;

        String binaryInteger = convertIntegerToBinary(integerPart);

        String binaryFractional = convertFractionalToBinary(fractionalPart);

        String binaryRepresentation = binaryInteger + "." + binaryFractional;

        System.out.println("Floating-point binary representation: " + binaryRepresentation);

        normalizeBinary(binaryRepresentation);
    }

    private static String convertIntegerToBinary(int integerPart) {
        StringBuilder result = new StringBuilder();
        while (integerPart > 0) {
            int remainder = integerPart % 2;
            result.insert(0, remainder);
            integerPart /= 2;
        }
        return result.toString().isEmpty() ? "0" : result.toString();
    }

    private static String convertFractionalToBinary(double fractionalPart) {
        StringBuilder result = new StringBuilder();
        int precision = 20;
        int count = 0;
        while (fractionalPart > 0 && count < precision) {
            fractionalPart *= 2;
            int bit = (int) fractionalPart;
            result.append(bit);
            fractionalPart -= bit;
            count++;
        }
        return result.toString();
    }

    private static void normalizeBinary(String binaryNumber) {
        int pointIndex = binaryNumber.indexOf('.');

        int leadingZeros = 0;
        while (leadingZeros < pointIndex && binaryNumber.charAt(leadingZeros) == '0') {
            leadingZeros++;
        }

        String normalizedNumber = binaryNumber.substring(leadingZeros);

        int exponent = 0;
        if (leadingZeros < pointIndex) {
            exponent = pointIndex - leadingZeros - 1;
            normalizedNumber = normalizedNumber.replace(".", "");
        }

        while (normalizedNumber.charAt(0) == '0') {
            normalizedNumber = normalizedNumber.substring(1);
            exponent--;
        }

        if (normalizedNumber.length() > 1) {
            normalizedNumber = normalizedNumber.substring(0, 1) + "." + normalizedNumber.substring(1);
        }

        int bias = 127;
        int biasedExponent = exponent + bias;

        normalizedNumber = normalizedNumber + " x 2^" + exponent;
        System.out.println("Normalized Number: " + normalizedNumber);
        
        String biasedNumber = normalizedNumber + " x 2^" + biasedExponent;
        System.out.println("Biased Number: " + biasedNumber);

        // return normalizedNumber;
    }
}
