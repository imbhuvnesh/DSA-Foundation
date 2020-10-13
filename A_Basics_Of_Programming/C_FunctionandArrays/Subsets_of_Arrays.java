package C_FunctionandArrays;

import java.util.Scanner;

/*
Iss question me humko given array ke subsets print krne hai, 
No. of subsets = 2^n, n = no. of elements in a array

e.g. n = 3, arr[n] = [10, 20, 30]
    output = _  _   _
             _  _   30
             _  20  _
             _  20  30
             10 _   _
             10 _   30
             10 20  _
             10 20  30
*/

public class Subsets_of_Arrays {
    public static void findSubsets(int[] A) {
        int limit = (int) Math.pow(2, A.length);
        for (int i = 0; i < limit; i++) { // outer loop 2 ^ n times chlega
            String set = "";
            int temp = i;
            for (int j = A.length - 1; j >= 0; j--) { //andar wala n times
                int d = temp % 2;   // getting binary digits
                temp /= 2;

                if (d == 0) {   // agar 0 aaya toh "-" print krdo
                    set = "-\t" + set;
                } else {        //nhi toh element
                    set = A[j] + "\t" + set;
                }
            }
            System.out.println(set);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        findSubsets(arr);
        scn.close();
    }
}
