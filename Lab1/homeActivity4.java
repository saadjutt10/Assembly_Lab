public class homeActivity4 {
    public static void main(String[] args) {
        double value = 0.625;
        int F = 5;
        int digitCount = 0;

        StringBuilder result = new StringBuilder(".");

        while (value != 0 && digitCount < F) {
            double temp = value * 2;
            int digit = (int) temp;
            result.append(digit);
            value = temp - digit;
            digitCount++;
        }

        System.out.println("Binary fraction: " + result.toString());
    }
}
