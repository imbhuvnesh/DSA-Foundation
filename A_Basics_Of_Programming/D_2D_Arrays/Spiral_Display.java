package D_2D_Arrays;

import java.util.Scanner;

public class Spiral_Display {
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

        int minr = 0;
        int minc = 0;
        int maxr = A.length - 1;
        int maxc = A[0].length - 1;

        int totalElements = r * c;
        int counter = 0;

        while (counter < totalElements) {
            //left wall
            for (int i = minr, j = minc; i <= maxr && counter < totalElements; i++) {
                System.out.println(A[i][j]);
                counter++;
            }
            minc++;
            //bottom wall
            for (int i = maxr, j = minc; i <= maxc && counter < totalElements; j++) {
                System.out.println(A[i][j]);
                counter++;
            }
            maxr--;
            //right wall
            for (int i = maxr, j = minc; i >= minr && counter < totalElements; i--) {
                System.out.println(A[i][j]);
                counter++;
            }
            maxc--;
            //top wall
            for (int i = minr, j = maxc; j >= minc && counter < totalElements; j--) {
                System.out.println(A[i][j]);
                counter++;
            }
            minr++;
        }
    }
}
