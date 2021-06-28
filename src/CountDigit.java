import java.util.Scanner;

public class CountDigit {
    public static void main(String args[]) {
        int num[] = {1,1,1,11,12,2,3,4,5,1,2,10,11};
        int count = 0;
        for (int i = 0; i < 99; i++) {
            for (int j = 0; j < num.length; j++) {
                if (num[j] == i) {
                    count++;
                }
            }
            if (count != 0) {
                System.out.print(i + "=" + count + " ");
                count = 0;
            }
        }
    }
}
