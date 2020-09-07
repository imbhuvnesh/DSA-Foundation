package C_FunctionandArrays;

import java.util.Scanner;

//Iss question me hume ek array given hoga uska ek bar chart draw krna hai
/*

        n = 5(no. of elements in array), arr[n] = 3, 1, 0, 7, 5


                            *		
                            *		
                            *	*	
                            *	*	
                *			*	*	
                *			*	*
                *	*		*	*		

                aisa draw krna hai
*/
public class BarChart {
    public static void barChart(int[] A) {
        int max = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }

        for (int i = max; i >= 1; i--) {        //bahar wala loop row ko control krega
            for (int j = 0; j < A.length; j++) {    // andar wala columns ko
                if (A[j] >= i) {    //agar element i se bda ya brabar hai toh * print
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");// nhi toh space
                }
            }
            System.out.println();
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

        barChart(arr);
    }
}