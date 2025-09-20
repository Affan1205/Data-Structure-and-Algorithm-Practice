//To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class PracticeQues07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the nth term: ");
        int num = input.nextInt();
        int ans = calculateFibonacci(num);
        System.out.println("Fibonacci series " + num + " is " + ans);
    }

    static int calculateFibonacci(int n) {

        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 2; i < n; i++) {
            sum = a + b;
            a = b;// for moving forward we first assign to b to a ans then sum to b;
            b = sum;
        }
        return sum;
    }
}
