package B_Patterns;

import java.util.Scanner;

//is question me diamond ka inverse print krna hai
/**
            *** ***
            **   **
            *** ***
        
            iss qustion me ulta kaam krdege star ki jgh space print krdege
            and n will be odd.
 */

public class Pattern6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        scn.close();


        int stars = n/2+1;
        int spaces = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            if (i <= n / 2) {
                stars--;
                spaces += 2;
            }
            else {
                stars++;
                spaces -= 2;
            }
            System.out.println();
        }
    }
}