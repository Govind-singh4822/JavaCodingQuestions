//Remove white spcae from string
import java.util.Scanner;
public class RemoveWhiteSpace {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a String : ");
        String str = input.nextLine();

        String remSpace = str.replaceAll(" ","");
        System.out.printf("\nInput String : %s\n",str);
        System.out.printf("Input String Without space : %s",remSpace);


        // 2nd method

        char charArray[] = str.toCharArray();
        String stringWithoutSpace = "";
        for(int i=0;i<str.length();i++)
        {
            if((charArray[i]!=' ')&&(charArray[i]!= '\t'))
            {
                stringWithoutSpace = stringWithoutSpace + charArray[i];
            }
        }
        System.out.printf("\n\nInput String : %s\n",str);
        System.out.printf("Input String Without space : %s",stringWithoutSpace);








    }
}









