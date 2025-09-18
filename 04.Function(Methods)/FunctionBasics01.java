//A method is a block of code that performs a specific task and can be reused whenever needed.

import java.util.Scanner;

public class FunctionBasics01 {
    public static void main(String[] args) {
        greeting();// calling the greeting function
        sum();// calling the Sum function
    }

    //Ex-1
    static void greeting() {
        System.out.println("Hi, Java welcome you. ");
    }

    //Ex-2
    static void sum() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a + b;
        System.out.println("sum of " + a + " and " + b + " = " + sum);
    }
}
