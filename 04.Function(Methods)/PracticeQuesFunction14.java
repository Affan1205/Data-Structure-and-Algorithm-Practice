// Write a function that returns the sum of first n natural numbers.

import java.util.Scanner;

public class PracticeQuesFunction14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter till number you want sum : ");
        int num = input.nextInt();
        int ans = sum(num);
        System.out.println("sum of first " + num + " natural numbers " + " is " + ans);
    }

    static int sum(int n) {
        int add = 0;
        for (int i = 1; i <= n; i++) {
            add += i;
        }
        return add;
    }
}
