import java.util.Scanner;

public class DecimalToHexa {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter decimal number : ");
        int num = input.nextInt();
        int n =num;
        char hexaDecimal[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        String hexa = ""; //Initilizing binary to empty String
        int rem = 0;

        while (n>0)
        {
            rem = n%16;
            hexa = hexaDecimal[rem] +hexa;
            n = n / 16;
        }
        System.out.println("HexaDecimal is : "+hexa);
    }
}
