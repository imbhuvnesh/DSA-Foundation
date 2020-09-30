package C_FunctionandArrays;

import java.util.Arrays;
import java.util.Scanner;

/*
Iss Question me humko EK array given hoga aur ek number "k" humko
vo array no. k se rotate krna hai

e.g. n = 5, arr[n] = [1, 2, 3, 4, 5], k = 3
        output = [5, 4, 3, 1, 2]
*/

//Sulochan -

/*
Isme hum array ke 2 part karlege, arr1 jo "0" se arr.length-k-1 takk hoga
aur arr2 jo arr.length-k se arr.length - 1 takk hoga

ek baar arr1 ko reverse kro, arr2 ko kro

phir pure array ko kro

e.g. k = 3, Arr = [1, 2, 3 ,4, 5];

    a1 = 0 se 5 - 3 - 1 = 1
    a1 = [1, 2]
    a2 = 5 - 3 se 5 - 1 = 2 se 4
    a2 = [3, 4, 5]

    a1' = [2, 1], a2' = [5, 4, 3]

    a1' + a2' = [2, 1, 5, 4, 3]
    (a1' + a2')' = [3, 4 , 5, 1, 2]

    which is the resired result;
*/


public class Rotate_an_Array {

    //reverse function for the array
    public static void reverse(int A[], int i, int j) {
        int p1 = i;
        int p2 = j;

        while (p1 < p2) {
            int temp = A[p1];
            A[p1] = A[p2];
            A[p2] = temp;

            p1++;
            p2--;
        }
    }

    public static void rotate(int[] A, int k) {
        k = k % A.length;
        if (k < 0) {
            k += A.length;
        }
        //part 1
        reverse(A, 0, A.length - k - 1);

        //part2
        reverse(A, A.length - k, A.length - 1);

        //Whole Array
        reverse(A, 0, A.length - 1);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        int n = scn.nextInt();
        int A[] = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = scn.nextInt();
        }
        scn.close();

        rotate(A, k);

        System.out.println(Arrays.toString(A));
    }
}
