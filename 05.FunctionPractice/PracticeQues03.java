//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class PracticeQues03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter the principal amount: ");
        float principal = input.nextFloat();
        System.out.println("enter the timw: ");
        float time = input.nextFloat();
        System.out.println("enter the rate of interset: ");
        float rate = input.nextFloat();
        float ans = caluculateSimpleInterst(principal, time, rate);
        System.out.println("Simple Interst is " + ans);
    }

    static float caluculateSimpleInterst(float p, float t, float r) {
        float simpleIntest = (p * t * r) / 100;
        return simpleIntest;
    }
}
