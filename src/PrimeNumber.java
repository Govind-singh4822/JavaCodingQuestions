import java.util.Scanner;

public class PrimeNumber {
    public static int prime(int n)
    {
        int count = 0;

        for(int i=2;i<=n;i++)
        {
            if(n%i==0) {
                count++;
            }
        }

        if(count == 1)
        {
            return 1;
        }
        else {
            return 0;
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number : ");
        int num = input.nextInt();

        int isPrime = prime(num);
        if(isPrime==1)
        {
            System.out.printf("Prime number");
        }
        else {
            System.out.printf("Not a prime number");
        }

    }
}
