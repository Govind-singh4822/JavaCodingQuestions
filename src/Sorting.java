public class Sorting {
    public static void main(String[] args)
    {
        int num[]={2,3,4,5,7};
        int i;

        for(i=0;i<num.length;i++)
        {
            System.out.print(num[i]+" ");
        }

        for(i=0;i<num.length;i++)
        {
            for(int j=i+1;j<num.length;j++)
            {
                if(num[i]<num[j])
                {
                    int temp = num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
        System.out.println("\nSorted array is : ");
        for(i=0;i<num.length;i++)
        {
            System.out.print(num[i]+" ");
        }

    }
}
