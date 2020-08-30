package Patterns;

//is question me hume
/*
                     *	*	*	*	*	*	*	
                        *				*	
                            *		*	
                                *	
                            *	*	*	
                        *	*	*	*	*	
                    *	*	*	*	*	*	*

                    yee pattern print krna h,
                    n odd h 
*/

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        scn.close();

        int spaces = 0; 
        int stars = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t"); 
            }
            for (int j = 1; j <= stars; j++) {
                if ((i > 1 && i <= n / 2) && (j > 1 && j < stars)) { // 1se row ke baad
                    System.out.print("\t");                      //aur phle star ke bad aur last star se phle
                } else
                    System.out.print("*\t");
            }
            if (i < n / 2 + 1) {
                stars -= 2;
                spaces++;
            }
            else {
                stars += 2;
                spaces--;
            }
            System.out.println();
        }
    }
}