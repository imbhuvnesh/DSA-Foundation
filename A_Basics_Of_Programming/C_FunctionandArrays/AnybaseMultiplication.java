package C_FunctionandArrays;

/*
Iss question me humko do number n1, n2 of base b ki multiplication krni hai 
    e.g. n1 = 1220, n2 = 31, b = 5, result = 43320
*/

import java.util.Scanner;

public class AnybaseMultiplication {
    //multiply krne ke baad add krne ke lie anybase addition function use krege
    public static int anyBaseAddition(int b, int n1, int n2) {
        int res = 0;
        int power = 0;
        int carry = 0;
        int sum = 0;

        while (n1 != 0 || n2 != 0 || carry != 0) {
            int d1 = n1 % 10;
            n1 /= 10;

            int d2 = n2 % 10;
            n2 /= 10;

            sum = d1 + d2 + carry; // last digit of both nums + carry

            res += (sum % b) * Math.pow(10, power); // sum % b == result digit
            power++; // e.g. 7 + 1 = 8 => 8 % 8 = 1(carry)(octal case)

            carry = sum / b; // update krdo carry ko, 8 / 8 = 1, in octal
        }
        return res;
    }

    //getOneSet wala function dusre number ki ek digit ko multiply krdega phle pure 
    //number se
    public static int getOneSetMultiplication(int b, int n1, int d2) {
        int result = 0;
        int carry = 0;
        int mul = 1;
        int power = 0;

        while (n1 != 0 || carry != 0) {
            int d1 = n1 % 10;
            n1 /= 10;

            mul = d1 * d2 + carry;
            carry = mul / b;

            mul %= b;

            result += mul * (int) Math.pow(10, power);
            power++;
        }

        return result;
    }

    public static int anybaseMultiplication(int b, int n1, int n2) {
        int result = 0;
        int power = 0;

        while (n2 != 0) {
            int d2 = n2 % 10;
            n2 /= 10;

            int oneSet = getOneSetMultiplication(b, n1, d2);
            result = anyBaseAddition(b, result, oneSet * (int) Math.pow(10, power));
            power++;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();


        scn.close();

        System.out.println(anybaseMultiplication(b, n1, n2));
    }
}
