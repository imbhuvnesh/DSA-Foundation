package B_Patterns;

import java.util.Scanner;

/**
 Is pattern me hume triangle print krna h but
 inverse of previous triangle

                   *
               *   *
           *   *   *
        *  *   *   *
     *  *  *   *   *
        like this
 */
public class Pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        scn.close();

        int spaces = n - 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) { // ye space bnadie phle 
                System.out.print("\t");         // agr n = 5 hai toh spaces n-1 max hoge
            }                                           
            for (int k = 1; k <= i; k++) {      //ye fir normally star print krdie
                System.out.print("*\t");
            }
            spaces--;
            System.out.println();
        }
    }
}