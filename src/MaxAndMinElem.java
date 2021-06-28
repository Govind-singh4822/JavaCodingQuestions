import java.util.Scanner;
public class MaxAndMinElem {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter number of element : ");
        int n = input.nextInt();
        int arr[] = new int[10];
         for(int i=0;i<n;i++)
         {
             arr[i] = input.nextInt();
         }
         int max = arr[0];
         int min = arr[0];
         for (int i=0;i<n;i++)
         {
             if(arr[i]>max)
             {
                 max = arr[i];
             }
             if(arr[i]<min)
             {
                 min = arr[i];
             }
         }

        System.out.println("Maximum element is "+max);
        System.out.println("Minimum element is "+min);


    }
}
