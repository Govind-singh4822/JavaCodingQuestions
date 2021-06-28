import java.util.Scanner;

public class SumEquOrUneqArray {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n,m,i,j,min,max;

        System.out.print("Enter size of array 1 : ");
        n = input.nextInt();
        int arr1[] = new int[n];
        System.out.print("Enter element in array 1 : ");
        for(i=0;i<n;i++)
        {
            arr1[i] = input.nextInt();
        }

        System.out.print("Enter size of array 2 : ");
        m = input.nextInt();
        int arr2[] = new int[m];
        System.out.print("Enter element in array 2 : ");
        for(i=0;i<m;i++)
        {
            arr2[i] = input.nextInt();
        }

        if(m>n)
        {
            max = m;
            min = n;
        }
        else {
            max = n;
            min = m;
        }

        int arr3[] = new int[max];

        for (i=0;i<min;i++)
        {
            arr3[i] = arr1[i] + arr2[i];

            for (j=0;j<max;i++)
            {
                if(m==max)
                {
                    arr3[j] = arr2[j];
                }
                else {
                    arr3[j] = arr1[j];
                }
            }

            System.out.printf("Sum of array : ");
            for (i=0;i<n;i++)
            {
                System.out.print(arr3[i]+" ");
            }

        }


    }
}
