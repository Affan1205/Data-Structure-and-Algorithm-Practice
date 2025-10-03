//input currency in rupees and output in USD.

import java.util.Scanner;

public class PracticeQuesJava6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the amount in rupees: ");
        double rupees = input.nextDouble();
        double dollar = rupees / 87;
        System.out.println(rupees + " in dollar " + dollar);
    }
}
