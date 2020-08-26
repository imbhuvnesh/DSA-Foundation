import java.util.Scanner;

/*isme yrrr hume hcf aur lcm nikalna h 2 given numbers ka 
hcd = gcd k lie eucledian algo use krege
*/

public class GcdLcm {
    public static int gcd(int a, int b) {
        while (a % b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }

        return b;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        scn.close();

        int hcf = gcd(a, b);
        int lcm = (a * b) / hcf; // lcm = 1st no. x 2nd no./ hcf;

        System.out.println(hcf);
        System.out.println(lcm);
    }
}