// }Write a function to check if a given triplet is a Pythagorean triplet or not. 
// (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).

import java.util.Scanner;

public class PracticeQuesFunction12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter the 3 inputs: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        boolean result = isPythagoreanTriplet(a, b, c);
        if (result) {
            System.out.println("Is a pythagorean Triplet.");
        } else {
            System.out.println("not a pythagorean Triplet.");
        }
    }

    static boolean isPythagoreanTriplet(int a, int b, int c) {
        if ((Math.pow(a, 2) + Math.pow(b, 2)) == (Math.pow(c, 2))) {
            return true;
        } else if ((Math.pow(b, 2) + Math.pow(c, 2)) == (Math.pow(a, 2))) {
            return true;
        } else if ((Math.pow(a, 2) + Math.pow(c, 2)) == (Math.pow(b, 2))) {
            return true;
        } else {
            return false;
        }
    }
}
