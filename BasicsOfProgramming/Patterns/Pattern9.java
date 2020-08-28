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
        int spaces = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 1; j++) {
                System.out.print("*");
            }
            spaces++;
            System.out.println();
        }
    }
}