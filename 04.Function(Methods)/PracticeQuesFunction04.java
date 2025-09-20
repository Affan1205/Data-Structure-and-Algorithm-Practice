// Write a program to print the sum of two numbers entered by user by defining your own method.

import java.util.Scanner;

public class PracticeQuesFunction04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the two number: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int ans = sum(a, b);
        System.out.println("Sum of two number is : " + ans);
    }

    static int sum(int a, int b) {
        return a + b;
    }

}
