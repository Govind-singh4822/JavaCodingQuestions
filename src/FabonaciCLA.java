public class FabonaciCLA {
    public static void fib(int n)
    {
        int a=0,b=1,c,i;
        if(n<=1)
        {
            System.out.println(n);
        }
        else {
            while (n!=0)
            {
                System.out.print(a+" ");
                c = a+b;
                a = b;
                b = c;
                n--;
            }
        }

    }
    public static void main(String[] args) {
        if (args.length > 0) {
            int num = Integer.parseInt(args[0]);
            fib(num);
        }
        else
        {
            System.out.printf("No command line "+args);
        }
    }

}
