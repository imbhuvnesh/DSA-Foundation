package C_FunctionandArrays;

import java.util.Scanner;

/*Iss me yar hume ek elemnt given hoga usko array ke andar dhundke uska 
    index return krna hai
    e.g. n = 6, arr[n] = [15,30,40,4,11,9,40], d = 40, result = 2 (Index of 40)
*/

//No need to explain this question you are smart
public class FindElementInArray {
    public static int findInArray(int[] A, int d) {
        int index = -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == d)
                index = i;
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int d = scn.nextInt();

        scn.close();

        System.out.println(findInArray(arr, d));
    }
}
