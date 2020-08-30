package Patterns;

//is question me humeye pattern print krna h
/*
                        1	
                        1	1	
                        1	2	1	
                        1	3	3	1	
                        1	4	6	4	1	
                        1	5	10	10	5	1	
                        1	6	15	20	15	6	1	
                        1	7	21	35	35	21	7	1	
                        1	8	28	56	70	56	28	8	1	

                        for given value of n


                        iss question me permutation combination used h
                            
*/

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        scn.close();

        for (int i = 0; i < n; i++) {
            int icj = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(icj + "\t");
                int icjp1 = icj * (i - j) / (j + 1);
                icj = icjp1;
            }
            System.out.println();
        }
    }
}