//To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class PracticeQuesJava7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the nth term: ");
        int num = input.nextInt();
        int a = 0;
        int b = 1;
        int sum = 0;
        System.out.print(a + " " + b);
        for (int i = 2; i < num; i++) {
            sum = a + b;
            System.out.print(" " + sum);
            a = b;
            b = sum;
        }
        System.out.println();
        System.out.println(num + "th fibonacci is : " + sum);
    }
}
// Scanner input = new Scanner(System.in);
// System.out.println("Enter the nth number: ");
// int num = input.nextInt();
// int a = 0, b = 1;
// int sum = 0;
// System.out.print(a + " " + b + " ");
// for (int i = 2; i <num; i++) {
// sum = a + b;
// System.out.print(sum + " ");
// a = b;
// b = sum;
// }
// System.out.println();
// System.out.println(num + "th fibonacci is : " + sum);