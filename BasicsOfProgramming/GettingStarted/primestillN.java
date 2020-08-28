package GettingStarted;

import java.util.Scanner;

//iss question me hume ek range ke andar primes print krne h
/* jse 1 se 20 ke bich ke prime number 
toh isme 2 input hoge ek low aur ek high*/

public class primestillN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt(); // input lelia
        int high = scn.nextInt();

        scn.close(); //scanner band krdia 

        for (int i = low; i <= high; i++) { // bahar wala loop for range low to high tak
            boolean isPrime = true; // default set kia ki number prime hai
            for (int j = 2; j * j <= i; j++) {  //fir prime check kia
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                System.out.println(i);
        }
    }
}