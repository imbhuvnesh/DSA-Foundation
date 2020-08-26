import java.util.Scanner;

//issme pythagoran triplet check krna h
// if a^2 = b^2 + c^2;

public class PythagoranTriplet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        scn.close();
        boolean isTriplet = false;
        if (a > b && a > c) {
            if ((a * a) == (b * b) + (c * c)) {
                isTriplet = true;
            }
        }
        else if (b > a && b > c) {
            if ((b * b) == (a * a) + (c * c)) {
                isTriplet = true;
            }
        }
        else {
            if ((c * c) == (a * a) + (b * b)) {
                isTriplet = true;
            }
        }

        if (isTriplet) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}