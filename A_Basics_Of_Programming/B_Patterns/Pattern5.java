package B_Patterns;

import java.util.Scanner;

//is question me diamond pattern print krna hai
// n hmesha odd hoga
/**
                   *
               *   *   *
           *   *   *   *   *
               *   *   *
                   *
 */

public class Pattern5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        scn.close();

        int spaces = n / 2;     //spaces  n/2 lela kyuki usme max n/2 spaces hi hote h
        int stars = 1;         //star 1 se start kia 

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("*\t");
            }

            if (i <= n / 2) { //isme yrr agr i jb n/2 se kam ya eql h
                spaces--;       //toh space kam aur start bdhao
                stars += 2;
            }
            else {          //else ulta
                spaces++;
                stars -= 2;
            }
            System.out.println();
        }
    }
}