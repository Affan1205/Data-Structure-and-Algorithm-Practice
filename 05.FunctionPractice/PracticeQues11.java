//Input a number and print all the factors of that number 

import java.util.Scanner;

public class PracticeQues11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter input : ");
        int num = input.nextInt();
        System.out.println("Factors of " + num + " are ");
        printingFactor(num);
    }

    static void printingFactor(int n) {
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
