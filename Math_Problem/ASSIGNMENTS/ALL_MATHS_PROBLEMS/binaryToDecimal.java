package Math_Problem.ASSIGNMENTS.ALL_MATHS_PROBLEMS;

public class binaryToDecimal {

        public static void main(String[] args) {
            // Binary number input directly as digits (e.g., 1101)
            int binaryInput = 1101;

            int decimalOutput = 0;
            int base = 1; // 2^0

            for (int i = binaryInput; i > 0; i /= 10) {
                int lastDigit = i % 10;  // Get the last digit
                decimalOutput += lastDigit * base;
                base *= 2;  // Move to the next base (2^1, 2^2, ...)
            }

            // Output the result
            System.out.println("Decimal Number: " + decimalOutput);

    }

}
