package Patterns;

import java.util.Scanner;

//Yha se ab numbers shuru hogye, isme hume ek no. triangle print krna h
/**
                    1
                    2   3
                    4   5   6
                    7   8   8   10
                    11  12  13  14  15

                    aise
 */

public class Pattern11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        scn.close();

        int inc = 1;
        for (int i = 1; i <= n; i++) {  //outer loop for lines
            for (int j = 1; j <= i; j++) { //andar wala loop i pe depend krta h
                System.out.print(inc + "\t");  //1 se i takk chlega
                inc++;      //inc bdjaega harr iteration me
            }
            System.out.println();
        }
    }
}