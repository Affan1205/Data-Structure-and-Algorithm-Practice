//Check Leap Year Or Not

import java.util.Scanner;

public class PracticeQues20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the input: ");
        int year = input.nextInt();
        boolean result = isLeapyear(year);
        if (result) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    static boolean isLeapyear(int n) {
        if ((n % 4 == 0 && n % 100 != 0 || n % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
