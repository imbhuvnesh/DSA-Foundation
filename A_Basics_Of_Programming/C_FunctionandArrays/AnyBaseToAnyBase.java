package C_FunctionandArrays;

import java.util.Scanner;

/*Yarr se question "Decimal to Anybase aur Anybase to Decimal ka combination hai"
    issm ek number "n" given hoga aur uska base "b1" given hoga, usko humko base "b2"
    me convert krna hai

    e.g. n = 111001, b1 = 2, b2 = 3
        isme n jo binary me hai usko base 3 me krna hai

    NOTE : "Phle given number ko decimal me kro fir decimal ko destination base me"
*/
public class AnyBaseToAnyBase {
    public static int anyBaseToDecimal(int n, int b) {
        int res = 0;
        int power = 0;

        while (n != 0) {
            int temp = n % 10; // n % 10 islie kyuki decimal me krna h
            n /= 10;

            res += temp * (int) Math.pow(b, power); // pow function me b islie
            power++; // kyuki jo current base hota h
        } // remainder usse multiply hota h

        return res;
    }
    
    public static int decimaltoAnyBase(int n, int b) {
        int res = 0; // result wala variable
        int power = 0;
        while (n != 0) {
            int temp = n % b; // reaminder lia
            n /= b; // num chota krdia

            res += temp * (int) Math.pow(10, power); // e.g. n = 123, b = 2
            power++; // 123 % 2 = 1
        } // 1 * 10 ^ 0 = 1

        return res;
    }
    public static int anybaseToanybase(int n, int sb, int db){
        int decimalValue = anyBaseToDecimal(n, sb); //decimal me kia
        
        int result = decimaltoAnyBase(decimalValue, db);  //decimal to destination base

        return result;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();
        
        scn.close();

        System.out.println(anybaseToanybase(n, b1, b2));
    }
}