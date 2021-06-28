import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter decimal number : ");
        int num = input.nextInt();
        int n =num;

        String binary = ""; //Initilizing binary to empty String
        int rem = 0;

        while (n>0)
        {
            rem = n%2;
            binary = rem +binary;
            n = n /2;
        }
        System.out.println("Binary is : "+binary);
    }
}

