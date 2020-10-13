package C_FunctionandArrays;

/*
Iss question me given array me ek element jo duplicate hai uska first aur last index nikalna hai

e.g. = n = 15, a[n] = [1, 5, 10, 15, 22, 33, 33, 33, 33, 33, 40, 42, 55, 66, 77]
    result = firstIndex = 5, lastIndex = 9
*/


import java.util.Scanner;

public class First_and_lastIndex {

    public static int first(int[] A, int d) {
        int l = 0;
        int h = A.length - 1;

        int res = -1;

        while (l <= h) {    //applying simple binary search
            int mid = (l + h)/2;
            if (A[mid] > d) {
                h = mid - 1;
            }
            else if (A[mid] < d) {
                l = mid + 1;
            }
            else{
                res = mid;
                h = mid - 1;    //main part ye data milne ke baad bhi dekhta rhega
            }
        }

        return res;

    }
    public static int last(int[] A, int d) {
        int l = 0;
        int h = A.length - 1;

        int res = -1;

        while (l <= h) {
            int mid = (l + h)/2;
            if (A[mid] > d) {
                h = mid - 1;
            }
            else if (A[mid] < d) {
                l = mid + 1;
            }
            else{
                res = mid;
                l = mid + 1;    //same data milne ke baad bhi dekhta rhega
            }
        }

        return res;

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        
        int d = scn.nextInt();

        scn.close();

        int first = first(arr, d);
        int last = last(arr, d);

        System.out.println(first);
        System.out.println(last);
    }
}
