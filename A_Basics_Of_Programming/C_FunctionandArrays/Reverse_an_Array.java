package C_FunctionandArrays;

/*
Iss question me humko ek array given hai usko reverse krna, many ways to do that,
best way hai bina koi space use kie

e.g. n = 5, A[n] = {1, 2, 3, 4, 5}, output = {5, 4, 3, 2, 1}
*/

import java.util.Scanner;

public class Reverse_an_Array {
    //just keep swapping and first and last element untill i is less than j
    public static void reverse(int A[]) {
        for (int i = 0, j = A.length - 1; i < j; i++, j--) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
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

        reverse(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}