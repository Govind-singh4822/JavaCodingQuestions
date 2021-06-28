import java.lang.reflect.Array;
import java.util.Arrays;

public class EqualityOfTwoArray {
    public static void main(String[] args)
    {
        int arr1[]={1,2,3,4,7};
        int arr2[]={1,2,3,4,5};
        boolean result = true;

        if(arr1.length == arr2.length)
        {
            for (int i=0;i<arr1.length;i++)
            {
                if(arr1[i]!=arr2[i])
                {
                    result = false;
                }
            }
        }
        else {
            result = false;
        }

        if(result)
        {
            System.out.println("Equal");
        }
        else {
            System.out.println("Not equal");
        }

        // 2nd method

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("\nAnother method : ");
        System.out.println(Arrays.equals(arr1,arr2));

        String s1[] = {"java","C","C++"};
        String s2[] = {"java","C","C++"};

        //String
        Arrays.sort(s1);
        Arrays.sort(s2);
        System.out.println("\n"+Arrays.equals(s1,s2));

    }
}
