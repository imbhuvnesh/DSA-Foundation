package C_FunctionandArrays;

import java.util.Arrays;
import java.util.Scanner;

/*
Iss question me humko array ka inverse nikalna hai matlab.
e.g. = given = [4, 0, 2, 3, 1], output = [1, 4, 2, 3, 0];

e.g. 0th index pe 4 pda hai toh 4 pe 0 daldo
*/

public class Inverse_of_an_Array {
    public static int[] inverse(int [] A){
        int result[] = new int[A.length];

        for (int i = 0; i < result.length; i++) {
            result[A[i]] = i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int A[] = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = scn.nextInt();
        }
        scn.close();

        int inverse[] = inverse(A);

        System.out.println(Arrays.toString(inverse));

    }
}
