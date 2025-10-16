// To find Armstrong Number between two given number.

import java.util.Scanner;

public class PracticeQuesJava9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first number");
        int num1 = input.nextInt();
        System.out.println("enter the second number");
        int num2 = input.nextInt();
        System.out.println("Armstrong number b/w " + num1 + " and " + num2 + " is :
        ");
        for (int i = num1; i < num2; i++) {
        int temp = i;
        int t = temp;
        int count = 0;
        // count digit
        while (t != 0) {
        count++;
        t = t / 10;
        }

        // Calculating Armstrong Number
        t = temp;
        int ans = 0;
        while (t != 0) {
        int digit = t % 10;
        ans = ans + (int) Math.pow(digit, count);
        t = t / 10;
        }
        // checking armstrong or not
        if (ans == i) {
        System.out.println(i + " ");
        }
        }
    }
}
