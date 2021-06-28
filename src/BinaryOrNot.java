import java.util.Scanner;

public class BinaryOrNot {
    public static void CheckBinary(int num)
    {
        boolean isBinary = true;
        int n = num;
        while (num>0)
        {
            int rem = num%10;
            if(rem>1)
            {
                isBinary = false;
                break;
            }
            else {
                num = num / 10;
            }
        }
        if(isBinary)
        {
            System.out.printf(n+" is a Binary number ");
        }
        else {
            System.out.println(n+" is not a binary number ");
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = input.nextInt();

        CheckBinary(num);
    }
}
