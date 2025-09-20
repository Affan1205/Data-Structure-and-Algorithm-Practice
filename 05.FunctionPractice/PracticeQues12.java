// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

import java.util.Scanner;

public class PracticeQues12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter input(exit 0)");
        int sum = 0;
        while (true) {
            int num = input.nextInt();
            if (num == 0) {
                break;
            } else {
                sum += num;
            }
        }
        System.out.println("sum of enter input is " + sum);
    }
}
