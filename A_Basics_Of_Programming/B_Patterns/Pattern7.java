package B_Patterns;

import java.util.Scanner;

//iss me hume diagonal line print krni h
/*
        *
            *
                *
                    *
                        *
                            *

        Aisi
 */
public class Pattern7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        scn.close();
        
        for (int i = 1; i <= n; i++) {      //bhar vala row ke lie
            for (int j = 1; j <= n; j++) { //andar wla clumn k lie
                if(i == j)
                    System.out.print("*\t");        //jab i == j hoga tbhi print krna
                else
                    System.out.print("\t");    
            }
            System.out.println();
        }
    }
}