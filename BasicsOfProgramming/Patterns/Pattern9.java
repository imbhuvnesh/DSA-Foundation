package Patterns;

import java.util.Scanner;

//In this pattern problem we need to print a x
/*
            *               *
                *       *
                    *
                *       *
            *               *

            like this , n will be odd
*/
public class Pattern9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        scn.close();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1) {
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}