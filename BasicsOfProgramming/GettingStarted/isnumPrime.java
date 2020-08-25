import java.util.Scanner;

//is question me hume check krna h ke given number prime hai ki nhi
//krne ke bhot tarike hai 
/*prime no. vo h jo khudse ya 1 se divide hota h toh check krne ke lie hum isko
sbhi number se divide kra skte h*/
public class isnumPrime {
    //this method is very naive and time consuming
    public static void isPrime(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) { // matbal remainder 0 h, divide hogya
                System.out.println("Not prime");
                break;
            } else {
                System.out.println("prime");
                break;
            }
        }
    }

    public static void isPrimeFaster(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.println("not prime");
                break;
            }
            else {
                System.out.println("prime");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        isPrime(num); //naive
        
        isPrimeFaster(num); //faster

        scn.close();
    }
}