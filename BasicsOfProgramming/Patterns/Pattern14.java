package Patterns;


//yrr iss question me diamond ke andar number pattern h
/*
                            1	
                        2	3	2	
                    3	4	5	4	3	
                        2	3	2	
                            1	

                            ye wala
                            n, will be odd!
 */

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        scn.close();

        int spaces = n / 2;
        int stars = 1;

        int c = 1;
        //phle diamond print krle phir usko change krlege
        for (int i = 1; i <= n; i++) {
            int p = c;
            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print(p + "\t");
                if (j <= stars / 2) { //controlling the column that's the key
                    p++;
                }
                else {
                    p--;
                }
            }
            if (i <= n / 2) {
                spaces--;
                stars += 2;
                c++;
            }
            else {
                spaces++;
                stars -= 2;
                c--;
            }
            System.out.println();
        }
    }
}