import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter number : ");
        int num = input.nextInt();
        int sum=0,largest=0;
        int smallest=num%10,i=0;
        int arr[] = new int[20];

        while (num!=0)
        {
            int rem = num%10;
            if(rem>largest)
            {
                largest = rem;
            }
            if(smallest>rem)
            {
                smallest=rem;
            }
            if(rem%2==0)
            {
                arr[i]= rem;
                i++;
            }
            sum = sum+rem;
            num=num/10;
        }

        System.out.println("Sum is : "+sum);
        System.out.println("Largest digit is : "+largest);
        System.out.println("Smallest digit is : "+smallest);
        System.out.println("Even digit : ");
        i=0;
        while (arr[i]!=0)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
            i++;
        }
    }
}
