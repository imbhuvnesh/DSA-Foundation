package D_2D_Arrays;

import java.util.Scanner;

public class Exit_Point_of_Matrix {
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

        int dir = 0; // direction ke lie variable
        int i = 0;
        int j = 0;

        while (true) {
            dir = (dir + A[i][j]) % 4;  //agr a[i][j] 0 ho toh 0 add krdo nhi toh 1 krdo
                if (dir == 0)  {    //agar dir 0 hai toh east me chlte rho (column)
                    j++;            
                } else if (dir == 1) {  //if dir = 1 toh south me mud jao (row++)
                    i++;
                } else if (dir == 2) {  //agar dir = 2 toh west (column--)
                    j--;
                } else if (dir == 3) {  //agar dir = 3 toh norht (row--)
                    i--;
                }

                if (i < 0) {    //exit conditons sabme break krne se phle increment kia taki result mile
                    i++;
                    break;
                } else if (j < 0) {
                    j++;
                    break;
                } else if (i == A.length) {
                    i--;
                    break;
                } else if (j == A[0].length) {
                    j--;
                    break;
                }
        }

        System.out.println(i);
        System.out.println(j);

        scn.close();
    }
}
