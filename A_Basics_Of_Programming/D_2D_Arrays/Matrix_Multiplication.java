package D_2D_Arrays;

import java.util.Scanner;

/*
Iss Question me 2 2D-Arrays kok multiply krna hai
*/


public class Matrix_Multiplication {

    public static void multiplyMatrices(int[][] A, int[][] B) {
        if (A[0].length == B.length) { // agar no. of columns of first matrix is equal to no. of rows of 2nd matrix
            int res[][] = new int[A.length][B[0].length];  //nya matrix bnaya

            for (int i = 0; i < res.length; i++) {  //first loop bahar rows ke lie
                for (int j = 0; j < res[i].length; j++) {   //2nd looop columns k lie
                    for (int k = 0; k < B.length; k++) {    //yaha pe multiplication ke le row aur colums k lie
                        res[i][j] += A[i][k] * B[k][j];     // colums of matrix and row of 2nd matrix remain same all time
                    }
                }
            }

            for (int i = 0; i < res.length; i++) {
                for (int j = 0; j < res[0].length; j++) {
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Can't be multiplied");
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        int a1[][] = new int[n1][m1];

        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                a1[i][j] = scn.nextInt();
            }
        }

        int n2 = scn.nextInt();
        int m2 = scn.nextInt();
        int a2[][] = new int[n2][m2];

        for (int i = 0; i < a2.length; i++) {
            for (int j = 0; j < a2[i].length; j++) {
                a2[i][j] = scn.nextInt();
            }
        }

        scn.close();

        multiplyMatrices(a1, a2);

    }
}