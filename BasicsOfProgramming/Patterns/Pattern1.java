package Patterns;

import java.util.Scanner;

//isme hume ek triangle pattern print krna h
/*
                *
                * *
                * * *
                * * * *
                aisa
                for given number n
*/

public class Pattern1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        scn.close();

        for (int i = 1; i <= n; i++) {      //outer loop lines change krne ke lie
            for (int j = 1; j <= i; j++) {  //inner loop ek line me kitne print krne h
                System.out.print("*\t");      //uske lie
            }
            System.out.println();
        }
    }
}