import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter decimal number : ");
        int num = input.nextInt();
        int n =num;

        String octal = ""; //Initilizing binary to empty String
        int rem = 0;

        while (n>0)
        {
            rem = n%8;
            octal = rem + octal;
            n = n /8;
        }
        System.out.println("Octal is : "+octal);
    }
}
