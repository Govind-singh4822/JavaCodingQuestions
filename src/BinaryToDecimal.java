import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter binary number : ");
        int n = input.nextInt();

        int dec = 0,i=0,rem;

        while (n!=0)
        {
            rem = n%10;
            n = n/10;

            ++i;
        }
    }
}
