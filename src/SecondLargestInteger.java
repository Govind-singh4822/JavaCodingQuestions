import java.util.Scanner;

public class SecondLargestInteger {
    public static void main(String[] args)
    {
        int arr[] = new int[5];
        int firstLargest,secoundLargest;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array element : ");
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextInt();
        }

        if(arr[0]>arr[1])
        {
            firstLargest = arr[0];
            secoundLargest = arr[1];
        }
        else {
            firstLargest = arr[1];
            secoundLargest = arr[0];
        }

        for(int i=2;i<5;i++)
        {
            if(arr[i] > firstLargest)
            {
                secoundLargest = firstLargest;
                firstLargest = arr[i];
            }

            else if(arr[i]< firstLargest && arr[i]> secoundLargest){
                secoundLargest = arr[i];

            }
        }

        System.out.println("Largest element is : "+firstLargest);
        System.out.println("Secound largest element is : "+secoundLargest);
    }
}
