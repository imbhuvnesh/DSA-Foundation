package C_FunctionandArrays;

import java.util.Scanner;

/*Iss question me 2 numbers "n1", "n2" given with same base "b"
    Unka Subtraction krnaa hai
    e.g. n1 = 1, n2 = 100, b = 8, result = 77
    Given = n2 > n1

*/

public class AnybaseSubtraction {
    public static int anyBaseSubtraction(int b, int n1, int n2) {
        int result = 0;
        int sub = 0;
        int power = 0;
        int carry = 0;

        while (n2 != 0) {
            int d1 = n2 % 10;   //last digit uthai
            n2 /= 10;

            int d2 = n1 % 10;   //last digit uthai
            n1 /= 10;

            d1 += carry;   //bade num ki last digit me carry add kri jo shuru me 0 hai

            if (d1 < d2) {  //agr d1 chota hai toh borrow krlia
                carry = -1;
                d1 += b;    //aur d1 me base add krdia
            }
            else {
                carry = 0;  //NHI TOH   CARRY 0
            }

            sub = d1 - d2;  //fir subtract krdia

            result += sub * (int) Math.pow(10, power); //fir number bnaya
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
        
        System.out.println(anyBaseSubtraction(b, n1, n2));

    }
}