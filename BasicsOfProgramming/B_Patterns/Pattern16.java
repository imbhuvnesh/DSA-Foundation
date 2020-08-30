package B_Patterns;

import java.util.Scanner;

//yarr iss pattern me hume ek arrow print krna h, teer kamaan

/*
                                *	
                                *	*	
                        *	*	*	*	*	
                                *	*	
                                *	

                                aisa
                                n is odd
*/
public class Pattern16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        scn.close();
        int spaces = n / 2;
        int stars = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) {
                if (i == n / 2 + 1) {           //bich wali line me sare star h islie
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");    
                }
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*\t");
            }
            if (i <= (n / 2)) { // controlling increment and decrement
                stars++;
            }
            else {
                stars--;
            }
            System.out.println();
        }
    }   
}