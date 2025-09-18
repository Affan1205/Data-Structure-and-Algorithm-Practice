//input currency in rupees and output in USD.

import java.util.Scanner;

public class PracticeQuesJava6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter amount in rupees : ");
        float rupees = input.nextFloat();
        float doller = rupees / 87;
        System.out.println(rupees + " is " + doller + " in dollar.");
    }
}
