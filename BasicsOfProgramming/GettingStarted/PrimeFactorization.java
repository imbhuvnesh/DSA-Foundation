package GettingStarted;

import java.util.Scanner;

/*
Iss me prime factorization krni h given no. ki
 */

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        scn.close();

        for (int i = 2; i * i <= num; i++) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num = num / i;
            }
        }

        if (num != 1)
            System.out.print(num);
    }
}