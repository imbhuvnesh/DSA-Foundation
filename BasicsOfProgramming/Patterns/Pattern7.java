package Patterns;

import java.util.Scanner;

//iss me hume diagonal line print krni h
/*
        *
            *
                *
                    *
                        *
                            *

        Aisi
 */
public class Pattern7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        scn.close();
        
        int spaces = 0; //max
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= 1; j++) { //just printing 1 star per line
                System.out.print("*\t");
            }
            spaces++;
            System.out.println();
        }
    }
}