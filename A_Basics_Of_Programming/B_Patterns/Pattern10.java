package B_Patterns;

import java.util.Scanner;


//Is pattern problem me hume ek hollow diamond print krna h
/*
                                *
                            *       *
                        *               *
                            *       *
                                *

                                aisa
*/                      
public class Pattern10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        scn.close();
        
        int os = n/2;
        int is = -1;
        for (int i = 1; i <= n; i++) {  // controlling rows
            for (int j = 1; j <= os; j++) {     //phla loop outerspace print krega
                System.out.print("\t");
            }
            for (int j = 1; j <= 1; j++) {      //*
                System.out.print("*\t");
            }
            for (int j = 1; j <= is; j++) {     //inner space
                System.out.print("\t");
            }   
            if(i > 1 && i < n)                  //aur ye loop jab i > 1 se bda aur n se 
                for (int j = 1; j <= 1; j++) {  //chota hoga tab chlega kyuki
                    System.out.print("*\t");    //top aur last star repeat hojaege nhi toh
                }
            if (i <= n / 2) {
                os--;
                is += 2;
            }
            else {
                os++;
                is -= 2;
            }
            System.out.println();
        }
    }
}