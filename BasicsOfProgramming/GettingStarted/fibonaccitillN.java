import java.util.Scanner;

/*is me yr fibonnaci series print krni h, abhi hume recursion nhi aata toh
hum issse iteratively krege */
/*eg. 0 1 1 2 3 5 8 .... 
matlab agla number pichle do numbers ka sum hoga
*/

public class fibonaccitillN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); //input jaha takk print krna h

        scn.close();
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}