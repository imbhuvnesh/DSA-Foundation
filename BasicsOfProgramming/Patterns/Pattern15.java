package Patterns;


//iss question me hume ye pattern print krna h for given n;
/**
                    1												1	
                    1	2										2	1	
                    1	2	3								3	2	1	
                    1	2	3	4						4	3	2	1	
                    1	2	3	4	5				5	4	3	2	1	
                    1	2	3	4	5	6		6	5	4	3	2	1	
                    1	2	3	4	5	6	7	6	5	4	3	2	1	


                    aisa
                    isme n rows hai , aur 2n-1 columns
                    aur bich me spaces hai 2n-3 (max) fir 2 se decrease ho rhe h
 */

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        scn.close();
        
        int spaces = 2 * n - 3; //spaces
        int stars = 1;  //stars
        
        for (int i = 1; i <= n; i++) {          //outer loop for lines  
            int val = 1;                        //val ko print krege
            for (int j = 1; j <= stars; j++) {      //phle star print krege
                System.out.print(val + "\t");
                val++;                          //aur val ko bdhadege
            }
            for (int j = 1; j <= spaces; j++) {     //fir spaces print krege
                System.out.print("\t");     
            }
            if (i == n) { //last me ek star jyada print na ho islie
                stars--;    // i == n pe stars aur val - 1 krdia
                val--;
            }
            for (int j = 1; j <= stars; j++) {      //fir dubara star print krege
                val--;                             //val ko phle kam kia
                System.out.print(val + "\t");     
            }
            spaces -= 2;
            stars++;
            val++;
            System.out.println();
        }
}
}