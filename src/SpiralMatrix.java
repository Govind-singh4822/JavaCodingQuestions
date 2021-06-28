import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int arr[][] = new int[3][3];
        int i,j,row=0,col=0,m,n;

        System.out.printf("Enter the size of row : ");
        m = input.nextInt();
        System.out.printf("Enter the size of coloumn : ");
        n = input.nextInt();

        System.out.printf("\nEnter element of matrix : \n");

        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j] = input.nextInt();
            }
        }

        System.out.printf("\nElement of matrix are : \n");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.printf("%d\t",arr[i][j]);
            }
            System.out.printf("\n");
        }

        System.out.printf("\nSpiral form of matrix : \n");

        while(row < m && col < n)
        {
            for(i=col;i<n;i++)
            {
                System.out.printf("%d ",arr[row][i]);
            }
            row++;

            for(i=row;i<m;i++)
            {
                System.out.printf("%d ",arr[i][n-1]);
            }
            n--;

            if(row < m)
            {
                for(i=n-1;i>=col;i--)
                {
                    System.out.printf("%d ",arr[m-1][i]);
                }
                m--;
            }

            if(col < n)
            {
                for(i=m-1;i>=row;i--)
                {
                    System.out.printf("%d ",arr[i][col]);
                }
                col++;
            }
        }
        System.out.printf("\n\n");

    }
}
