package D_2D_Arrays;

/*
Iss question me humko matrix wave pattern me traverse krna hai
e.g. = given matrix [1, 2]
                    [3, 4]

        toh traversal hoga 1 -> 3 -> 4 -> 2


        Figure this out own your own
*/


import java.util.Scanner;

public class Wave_Traversal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();

        int[][] A = new int[r][c];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = scn.nextInt();
            }
        }

        scn.close();
        
        for (int col = 0; col < A[0].length; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < A.length; row++) {
                    System.out.print(A[row][col] + " ");
                }
            }
            else {
                for (int row = A.length - 1; row >= 0; row--) {
                    System.out.print(A[row][col] + " ");
                }
            }
        }

    }
}
