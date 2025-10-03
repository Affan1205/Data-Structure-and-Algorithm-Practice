//Take 2 numbers as input and print the largest number

import java.util.Scanner;

public class PracticeQuesJava5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter two number: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        // Method 1
        System.out.println(Math.max(num1, num2) + " is max");

        // Method 2
        if (num1 > num2) {
            System.out.println(num1 + " is max.");
        } else {
            System.out.print(num2 + " is max.");
        }
    }
}