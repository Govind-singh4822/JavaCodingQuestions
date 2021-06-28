import java.util.Scanner;

public class RotateMatrix {
    public static void main(String[] args)
    {
        int i,j,n;
        int arr[][] = new int[10][10];
        Scanner input = new Scanner(System.in);


        System.out.printf("\n\nEnter the size of row and coloumn : ");
        n = input.nextInt();

        System.out.printf("\nEnter element : \n");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j] = input.nextInt();
            }
        }

        System.out.printf("Before rotation of matrix : \n");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.printf("%d\t",arr[i][j]);
            }
            System.out.printf("\n");
        }


        System.out.printf("\nRotation in clockwise : \n");
        for(i=0;i<n;i++)
        {
            for(j=2;j>=0;j--)
            {
                System.out.printf("%d\t",arr[j][i]);
            }
            System.out.printf("\n");
        }

        System.out.printf("\nRotation in Anticlockwise : \n");
        for(i=2;i>=0;i--)
        {
            for(j=0;j<n;j++)
            {
                System.out.printf("%d\t",arr[j][i]);
            }
            System.out.printf("\n");
        }
        System.out.printf("\n]n");

    }
}
