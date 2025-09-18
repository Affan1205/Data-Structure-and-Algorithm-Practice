// Write a program to print the sum of two numbers entered by user by defining your own method.

import java.util.Scanner;

public class PracticeQuesFunction04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int ans = sum(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + ans);

    }

    static int sum(int a, int b) {
        return a + b;
    }
}
