package Patterns;

import java.util.Scanner;

//abki baar ek swastik print krna h yaar
/*
                        *   *   *       *
                                *       *
                        *   *   *   *   *
                        *       *
                        *       *   *   *

                        aise, n is odd
 */
public class Pattern18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        scn.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1) {
                    if (j == n || j <= n / 2 + 1) {
                        System.out.print("*\t");
                    }
                    else {
                        System.out.print("\t");
                    }
                }
                else if (i <= n / 2) {
                    if (j == n / 2 + 1 || j == n) {
                        System.out.print("*\t");
                    }
                    else {
                        System.out.print("\t");
                    }
                }
                else if (i == n / 2 + 1) {
                    System.out.print("*\t");
                }
                else if (i < n) {
                    if (j == 1 || j == n / 2 + 1) {
                        System.out.print("*\t");
                    }
                    else {
                        System.out.print("\t");
                    }
                }
                else if (i == n) {
                    if (j == 1 || j >= n / 2 + 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                } 
            }
            System.out.println();
        }
    }
}