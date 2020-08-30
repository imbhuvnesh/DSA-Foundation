package B_Patterns;

import java.util.Scanner;

/**
 Iss wale pattern me hume same triangle print krna h
 parr ulta
 */
public class Pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        scn.close();

        for (int i = n; i >= 1; i--) {     //abki baar loop ulta chla dia
            for (int j = 1; j <= i; j++) {  //andar ka kaam same
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}