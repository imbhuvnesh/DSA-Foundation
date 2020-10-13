package C_FunctionandArrays;

/*
Iss question me humko ek array aur ek no. given hoga, humko uss array me given no. ka ceil aur floor 
nikalna hai
Ceil = is defined as value in array which is just greater than d. 
If an element equal to d exists that will be considered as ceil.
Floor = is defined as value in array which is just lesser than d.
If an element equal to d exists that will be considered as floor.

e.g. = Given = n = 10, arr[n] = [1, 5, 10, 15, 22, 33, 40, 42, 55, 66], d= 34
        ceil = 40 , floor = 33
*/

import java.util.Scanner;

public class Ceil_and_Floor {

    public static void ceilAndfloor(int[] A, int d) {
        int l = 0;
        int h = A.length - 1;

        int ceil = 0;
        int floor = 0;

        while (l <= h) {    
            int mid = (l + h) / 2; // mid nikala

            if (A[mid] == d) {      //agar mid ke equal hai toh ceil = floor = d
                ceil = floor = A[mid];
            } else if (A[mid] < d) {    //agar mid se chota hai toh 
                // floor = A[mid];         floor = A[mid] 
                ceil = A[mid + 1];      // ceil = A[mid+1]
                l = mid + 1;            //aur low = mid + 1
            } else {
                h = mid - 1;        //else h = mid +1
            }
        }
        
        System.out.println(ceil);
        System.out.println(floor);
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

        ceilAndfloor(arr, d);

    }
}
