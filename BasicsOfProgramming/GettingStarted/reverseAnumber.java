import java.util.Scanner;

//bhot easy question hai yrr isme hume ek no. ka reverse bnana h
// sarri vhi purani technique use hogi
public class reverseAnumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        scn.close();
        int rev = 0; //reverse ke lie
        while (num != 0) {
            int temp = num % 10; //num ka last digit temp me store krlia
            num /= 10; //num ko 10 se divide krke chota krdia
            rev = rev * 10 + temp; // is se number ulta hojaega
        }
        /*e.g. given - 1234, result - 4321
            ``1st Iteration``
            temp = 4, num = 123, rev = 0 tha
            rev = 0 * 10 + 4;
            rev = 4;
            ``2nd Iteration``
            num = 123 
            temp = 3, num = 12, rev = 4
            rev = 4 * 10 + 3
            rev = 43 
            ``2nd Iteration``
            num = 123 
            temp = 3, num = 12, rev = 4
            rev = 4 * 10 + 3
            rev = 43 
            ``3rd Iteration``
            num = 12
            temp = 2, num = 1, rev = 43
            rev = 43 * 10 + 2
            rev = 432
            ``4th Iteration``
            num = 1
            temp = 1, num = 0, rev = 432
            rev = 432 * 10 + 1
            rev = 4321
            ``5th Iteration``
            Nhi hogi kyuki number zero hochuka h
        */
    }
}