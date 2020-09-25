package C_FunctionandArrays;

import java.util.Scanner;

/*
Is question me 2 arrays ka differnce nikalna hai
e.g. Given n1 = 3, A[n1] = {2,6,7}, n2 = 4, B[n2] = {1, 0, 0, 0}
    output = {7, 3, 3}
    NOTE = n2 > n1 (important)
*/

public class Difference_Of_TwoArrays {
    public static int[] diffOfArrays(int[] A, int[] B) {
        int result[] = new int[B.length];

        int i = A.length - 1;
        int j = B.length - 1;
        int k = result.length - 1;

        int carry = 0;

        while (k >= 0) { // jab tak result array na bhr jae
            int d1 = B[j];      //bade array ka ek element
            int Aval = i >= 0 ? A[i] : 0;   //chote wale ka element, agr i < 0 hai toh 
                                            // 0 lelia
            d1 += carry;            // d1 me carry add kri 

            if (d1 < Aval) {    // agar d1 Aval se chota hai toh carry lo
                carry = -1;       //aur d1 me base add kro
                d1 += 10;
            } else {
                carry = 0;      //nhi toh carry mat lo
            }

            int sub = d1 - Aval;    //ab subtract kro

            result[k] = sub;        //result me store kro

            i--;        //pointers ghatao
            j--;
            k--;
        }

        return result;  
    }

    public static void main(String[] args) {
        final Scanner scn = new Scanner(System.in);
        final int n1 = scn.nextInt();

        final int A[] = new int[n1];

        for (int i = 0; i < n1; i++) {
            A[i] = scn.nextInt();
        }
        final int n2 = scn.nextInt();

        final int B[] = new int[n2];

        for (int i = 0; i < n2; i++) {
            B[i] = scn.nextInt();
        }

        scn.close();

        int result[] = diffOfArrays(A, B); // getting result

        int idx = 0;                    //humare array me 0's hoskte h shuru me
        while (idx < result.length) {   //toh islie idx variable ko jab tak 0 na 
            if (result[idx] == 0) {     //khatam hojae tab takk bdhao
                idx++;
            } else {
                break;
            }
        }
        
        while (idx < result.length) {   //fir print krdo
            System.out.println(result[idx]);
            idx++;
        }
    }
}
