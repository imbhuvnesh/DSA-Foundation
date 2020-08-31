package C_FunctionandArrays;

import java.util.Scanner;

/*
    Iss question me humko pichle ka ulta krna hai, iss bar ek number given hai kisi 
    base "b" ka usko humko decimal me krna h jiska base 10 h

    e.g. (111001) iska base 2 given hai, toh isko decimal me krna h
        jruri nhi ki harr baar base 2 given hoga, koi bhi base ka ho skta h number
 */
public class AnyBaseToDecimal {
    public static int anyBaseToDecimal(int n, int b) {
        int res = 0;
        int power = 0;

        while (n != 0) {
            int temp = n % 10; //n % 10 islie kyuki decimal me krna h
            n /= 10;
            
            res += temp * (int) Math.pow(b, power); //pow function me b islie 
            power++;                                // kyuki jo current base hota h
        }                                           // remainder usse multiply hota h
        
        return res;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();     //given number n
        int b = scn.nextInt();     //base of given number n

        scn.close();

        System.out.println(anyBaseToDecimal(n, b));
    }
}