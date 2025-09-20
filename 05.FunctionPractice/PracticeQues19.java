// Perfect Number In Java

import java.util.Scanner;

public class PracticeQues19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter input: ");
        int num = input.nextInt();
        if (num == 0)// edge case
            System.out.println("invalid input");
        boolean result = isPerfectNumber(num);
        if (result) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " not a perfect number.");
        }
    }

    static boolean isPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            return true;
        }
        return false;
    }
}
