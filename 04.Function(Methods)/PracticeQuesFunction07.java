//Define a method to find out if a number is prime or not.

import java.util.Scanner;

public class PracticeQuesFunction07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter input: ");
        int num = input.nextInt();
        boolean result = isPrime(num);
        if (result) {
            System.out.println(num + " is Prime number.");
        } else {
            System.out.println(num + " is not a Prime number.");
        }
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
