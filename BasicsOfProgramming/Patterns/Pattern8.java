package Patterns;

import java.util.Scanner;

//abki baar pichle question ka ulta krna h
/*

                        *
                    *
                *
            *
        *
        
        aise
 */
public class Pattern8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        scn.close();

        int spaces = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= 1; j++) {
                System.out.print("*\t");
            }
            spaces--;
            System.out.println();
        }
    }
}