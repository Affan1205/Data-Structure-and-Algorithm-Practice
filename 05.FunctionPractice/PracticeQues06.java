// Input currency in rupees and output in USD.

import java.util.Scanner;

public class PracticeQues06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the currency in rupees: ");
        float rupees = input.nextFloat();
        float ans = changeCurrency(rupees);
        System.out.println(rupees + " Rs in dollar is $" + ans);
    }

    static float changeCurrency(float r) {
        float dollar = r / 87;
        return dollar;
    }
}
