package C_FunctionandArrays;

import java.util.Scanner;


/*Iss question me ek array ke andar maximum aur minimum element ka difference
    btana hai.
    e.g. n = 6(no. of elements in the array)
         arr[n] = [15,30,40,4,11,9]
         min = 4, max = 40, diff = 36
*/


public class SpanOfArray {
    public static int spanOfArray(int[] A) {
        int min = A[0];
        int max = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] < min) {
                min = A[i];
            }
            else if(A[i] > max){
                max = A[i];
            }
        }

        return max - min;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        scn.close();

        System.out.println(spanOfArray(arr));
    }
}
