//HCF and lcm Of Two Numbers Program

import java.util.Scanner;

public class PracticeQues18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter two number:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int ans = calculateHCF(num1, num2);
        System.out.println("Hcf of " + num1 + " and " + num2 + " is " + ans);
        int lcm = (num1*num2)/calculateHCF(num1, num2);
        System.out.println("lcm of " + num1 + " and " + num2 + " is " + lcm);
    }

    static int calculateHCF(int n1, int n2) {
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= Math.max(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                if (i > max) {
                    max = i;
                }
            }
        }
        return max;
    }
}
