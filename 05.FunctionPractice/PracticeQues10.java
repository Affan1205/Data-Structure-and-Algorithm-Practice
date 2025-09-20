// Subtract the Product and Sum of Digits of an Integer

import java.util.Scanner;

public class PracticeQues10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter input: ");
        int num = input.nextInt();
        int ans = subtractProductAndSum(num);
        System.out.println(
                "The Difference between the product of its digits and the sum of its digits of " + num + " is " + ans);
    }

    static int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return product - sum;
    }
}
