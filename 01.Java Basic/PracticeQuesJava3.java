//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class PracticeQuesJava3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the prinipal amount: ");
        double principal = input.nextDouble();
        System.out.println("enter the time ");
        double time = input.nextDouble();
        System.out.println("enter the rate of intrest: ");
        double rate = input.nextDouble();
        double simpleIntrest = (principal * rate * time) / 100;
        System.out.println("Simple Intrest = " + simpleIntrest);

    }
}
