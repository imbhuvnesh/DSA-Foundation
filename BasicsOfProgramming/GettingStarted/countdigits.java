package GettingStarted;

import java.util.Scanner;

//isme question me given no. ke andar kitne digits hai vo count krne h

public class countdigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        scn.close();

        int count = 0; //digits count krne ke lie

        while (num != 0) { // jab tak num 0 na hojae usko 10 se  divide krte rho
            num /= 10; //e.g. 234 / 10 = 23 --> 23 / 10 = 2 --> 2 / 10 = 0
            count++; //jab bhi number divide ho toh count bdhate raho
        }
        
        System.out.println(count);
    }
}