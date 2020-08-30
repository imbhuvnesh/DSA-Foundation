package B_Patterns;

import java.util.Scanner;

//is question me ye pattern print krna h
/*
                    0	
                    1	1	
                    2	3	5	
                    8	13	21	34	
                    55	89	144	233	377	

                    for a given value of n
 */
public class Pattern12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        scn.close();
        
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + "\t");
                int c = a + b;
                a = b;                      //Dhyan se dekh yaar fibonacci hai
                b = c;
            }
            System.out.println();
        }
    }
}