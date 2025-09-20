//To find Armstrong Number between two given number.

import java.util.Scanner;

public class PracticeQues09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter inputs: ");
        int startNum = input.nextInt();
        int endNum = input.nextInt();
        checkArmstrong(startNum, endNum);
    }

    static void checkArmstrong(int num1, int num2) {
        for (int i = num1; i < num2; i++) {
            if (isArmstrong(i)) {
                System.out.println(i + " ");
            }
        }
    }

    static boolean isArmstrong(int n) {
        // count digit
        int temp = n;
        int count = 0;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }
        // calculate Armstrong
        temp = n;
        int ans = 0;
        while (temp != 0) {
            int digit = temp % 10;
            ans = ans + (int) Math.pow(digit, count);
            temp = temp / 10;
        }
        if (ans != n) {
            return false;
        }
        return true;

    }
}
