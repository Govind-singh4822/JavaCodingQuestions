import java.util.Scanner;

public class MostOccChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter String : ");
        String str = input.nextLine();
        str = str.replaceAll(" ","");

        int count[] = new int[127]; // In C int count[ASCI_SIZE]={0};

        for (int i=0;i<str.length();i++)
        {
            count[str.charAt(i)]++; // count[a]=count[97]=0+1=1
        }

        int max=-1;
        char ch = ' ';

        for (int i=0;i<str.length();i++)
        {
            if(max < count[str.charAt(i)]) //max<count[97]=-1<1
            {
                max =count[str.charAt(i)];
                ch = str.charAt(i);
            }
        }
        System.out.println("Maximum Occuring character is : "+ch);
    }

}
