import java.util.Scanner;

public class SecoundMostOccChar {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a String : ");
        String str = input.nextLine();
        str = str.replaceAll(" ","");

        int arr[] = new int[256];
        int first=0,second=0,i;

        for (i=0;i<str.length();i++)
        {
            arr[str.charAt(i)]++; // count[a]=count[97]=0+1=1
        }


        for(i=0;i<256;i++)
        {
            if(arr[i]>arr[first])
            {
                second = first;
                first = i;
            }

            else if(arr[i]>arr[second] && arr[i]!=arr[first])
            {
                second = i;
            }

        }
        System.out.println((char) second);
    }
}







