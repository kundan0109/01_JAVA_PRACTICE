package Math_Problem;

public class Reverse_No {
    public static void main(String[] args) {
        int number = 1234;
        int reverse = 0;
        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        System.out.println("Sum: " + reverse);
    }

}
