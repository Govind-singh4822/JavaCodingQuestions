public class StringPalidrome {
    static boolean isPalidrome(String str)
    {
        int i=0,j=str.length()-1;

        while (i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
            return true;
    }
    public static void main(String[] args)
    {
        String str= "abba";

        if(isPalidrome(str))
        {
            System.out.println("String is Palidrome");
        }
        else {
            System.out.println("String is not palidrome");
        }
    }
}
