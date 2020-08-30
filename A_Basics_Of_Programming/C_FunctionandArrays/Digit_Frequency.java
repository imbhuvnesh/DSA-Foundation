package C_FunctionandArrays;

import java.util.Scanner;

/*iss problem me , ek given number ke andar digit btani h kitni baar aai hai
        e.g. 0126212 , 2 - isme btana hai 2 kitni baar aaya hai
            ans - 3, 2 teen baar aaya hai
*/
public class Digit_Frequency {
    public static int digitFreq(int n, int d) {
        int count = 0;
        while (n != 0) {    //jab tak num 0 na ho jae
            int temp = n % 10;      //num ka last digit
            n /= 10;                //num ko 1 digit se kam krdia
            if (temp == d) {        //agr temp d ke equal hai toh 
                count++;            //count ko bdha do
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();

        scn.close();

        int res = digitFreq(n, d);
        System.out.println(res);
    }
}