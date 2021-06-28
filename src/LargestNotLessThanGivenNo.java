//Java Program To Find Largest Number Less Than Given Number And Without A Given DIgit
import java.util.Scanner;
class LargestNoLessThanGivenNo {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter number : ");
        int num = input.nextInt();
        System.out.printf("Enter a digit which does not occur : ");
        int digit = input.nextInt();
        //converting digit to char
        char c = Integer.toString(digit).charAt(0);
        for (int i=num;i>0;--i)
        {
            if(Integer.toString(i).indexOf(c) == -1 )
            {
                System.out.println(i);
                break;

            }
        }

    }
}
