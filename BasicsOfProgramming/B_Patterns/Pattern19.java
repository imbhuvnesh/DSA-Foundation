package B_Patterns;

import java.util.Scanner;

//iss question me hume ek w print krna h for given n, n is odd
/*
                        *				*	
                        *				*	
                        *		*		*	
                        *	*		*	*	
                        *				*

                        aisa
 */
public class Pattern19 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        scn.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i > n / 2 && (i == j || i + j == n + 1)) { //aasan h khud sochlo
                    System.out.print("*\t");
                }
                else if (j == 1 || j == n) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}