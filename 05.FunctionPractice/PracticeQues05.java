//Take 2 numbers as input and print the largest number.
import java.util.Scanner;

public class PracticeQues05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter two input : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int ans = maximum(num1, num2);
        System.out.println("largest b/w " + num1 + " and " + num2 + " is " + ans);
    }

    static int maximum(int num1, int num2) {

        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        return max;
    }
}
