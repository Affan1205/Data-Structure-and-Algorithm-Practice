// Write a function that returns all prime numbers between two given numbers.

import java.util.Scanner;

public class PracticeQuesFunction13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the starting and ending number: ");
        int startNum = input.nextInt();
        int endtNum = input.nextInt();
        System.out.println("Prime Number b/w " + startNum + " and " + endtNum + " are ");
        isCount(startNum, endtNum);
    }

    static void isCount(int num1, int num2) {
        for (int i = num1; i < num2; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int num) {
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
