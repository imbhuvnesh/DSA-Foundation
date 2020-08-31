package C_FunctionandArrays;

import java.util.Scanner;

/*isss program me ek number 'n' given
 hoga usko humko base 'b' ke hisab se convert krna h

 e.g.  n = 57, b = 2, output = 111001
*/
public class DecimalToAnyBase {
    public static int getValueInBase(int n, int b) {
        int res = 0;        //result wala variable
        int power = 0;      
        while (n != 0) {
            int temp = n % b;   //reaminder lia
            n /= b;             //num chota krdia

            res += temp * (int) Math.pow(10, power);  //e.g. n = 123, b = 2
            power++;                                    // 123 % 2 = 1
        }                                              // 1 * 10 ^ 0 = 1

        return res;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();

        scn.close();

        System.out.println(getValueInBase(n, b)); //printing the result
    }
}