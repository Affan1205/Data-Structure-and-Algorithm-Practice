//counting occurance

import java.util.Scanner;

public class LectureQues3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number.");
        int num = input.nextInt();
        System.out.println("enter the digit of " + num + " to count digit: ");
        int occuranceDigit = input.nextInt();
        int count = 0;
        while (num != 0) {
            int digit = num % 10;
            if (digit == occuranceDigit) {
                count++;
            }
            num /= 10;
        }
        System.out.println("the occurance of " + occuranceDigit + " is " + count);
    }
}
