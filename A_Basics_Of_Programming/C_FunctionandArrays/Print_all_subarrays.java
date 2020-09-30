package C_FunctionandArrays;

import java.util.Scanner;


/*
Iss question me humko given array ke subarray print kre hai
e.g. given = [1, 2, 3]
    subArrays = [1], [1, 2], [1, 2, 3], [2], [2, 3], [3]
*/

public class Print_all_subarrays {
    public static void printSubarrays(int[] A) {
        for (int i = 0; i < A.length; i++) { //outer loop starting point ke lie
            for (int j = i; j < A.length; j++) {//inner loop end point ke lie
                for (int k = i; k <= j; k++) {  //k loop i se j takk print ke lie
                    System.out.print(A[k]);
                }
               System.out.println();
           }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();

        printSubarrays(arr);

    }
}
