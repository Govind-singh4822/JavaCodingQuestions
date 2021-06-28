import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int n = number;
        int noOfDigits = String.valueOf(number).length();

        int sum = 0;

        while (n != 0) {
            int r = n % 10;

            int lastDigitToThePowerOfNoOfDigits = 1;

            for (int i = 0; i < noOfDigits; i++) {
                lastDigitToThePowerOfNoOfDigits = lastDigitToThePowerOfNoOfDigits * r;
            }

            sum = sum + lastDigitToThePowerOfNoOfDigits;

            n = n / 10;
        }

        if (sum == number) {
            System.out.println(number + " is an armstrong number");
        } else {
            System.out.println(number + " is not an armstrong number");
        }
    }
}
