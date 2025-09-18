//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class PracticeQuesJava3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter principal amount ");
        float principal = input.nextFloat();
        System.out.println("enter time ");
        float time = input.nextFloat();
        System.out.println("enter rate of interst ");
        float rate = input.nextFloat();
        double simpleIntrest = (principal * time * rate) / 100;
        System.out.println("simple interst is = " + simpleIntrest);
    }
}
