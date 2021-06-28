public class  ReverseString {
    public static void main(String[] args) {

        String str = "Hellow";
        //1st method
        char ch[] = str.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }

        System.out.println("\n");

        //2nd method
        for(int i=str.length()-1;i>=0;i--)
        {
            System.out.print(str.charAt(i));
        }
        System.out.printf("\n\n");

        //3rd method

        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());

    }
}
