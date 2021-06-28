import java.util.Scanner;

public class SwapTwoNumber {
    public static void swap(int x ,int y)
    {
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("Number after  swapping "+x+" "+y);
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter value of x and y : ");
        int x = input.nextInt();
        int y = input.nextInt();

        System.out.println("Number before swapping "+x+" "+y);
        swap(x,y);
    }
}
