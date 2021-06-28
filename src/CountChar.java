import java.util.Scanner;
public class  CountChar {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter String : ");
        String str = input.nextLine();
        int count = 0;
        str = str.replaceAll(" ","");
        for(char i='a';i<='z';i++)
        {

            for (int j=0;j<str.length();j++)
            {
                if(i==str.charAt(j)){
                    count++;
                }
            }
            if(count!=0)
            {
                System.out.print(i+"="+count+" ");
                count=0;
            }
        }
    }
}
