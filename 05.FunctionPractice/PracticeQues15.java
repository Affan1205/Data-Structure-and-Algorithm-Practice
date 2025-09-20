// Find Ncr & Npr

import java.util.Scanner;

public class PracticeQues15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter n :");
        int n = input.nextInt();
        System.out.println("enter r: ");
        int r = input.nextInt();
        int num = fact(n);
        int deno = fact(r) * fact(n - r);
        int Ncr = num / deno;
        System.out.println("Ncr is " + Ncr);
    }

    static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int facti = 1;
        for (int i = 1; i <= n; i++) {
            facti *= i;
        }
        return facti;
    }
}
