// Write a program to print the factorial of a number by defining a method named 'Factorial'.

import java.util.Scanner;

public class PracticeQuesFunction09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter input: ");
        int num = input.nextInt();
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        }
        int ans = calculateFactorial(num);
        System.out.println("Factorial of " + num + " is : " + ans);
    }

    static int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
