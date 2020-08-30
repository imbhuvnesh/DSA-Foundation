package A_GettingStarted;

import java.util.Scanner;

/*is question me hume given number ke har digit ko print krana
 h ussi order me jisme number hai*/

public class digitsofnum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        scn.close();

        //pehle number digits count krlete h
        int temp = num;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        while (num != 0) {                          //jab tak num 0 na hojae usko               */
            int div = (int) Math.pow(10, count - 1); //10 ki power count - 1 se divide 
            int res = num / div;                    // krege. e.g. 1234 ka count 4 hai
            System.out.println(res);              // toh usko 10 ki power 4-1 se krege  
            num %= div;                     // i.e. 10 ^ 3 
            count--;
        }
    }
}