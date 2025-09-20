
//Define two methods to print the maximum and the minimum number respectively 
//among three numbers entered by the user.

import java.util.Scanner;

public class PracticeQuesFunction01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 3 numbers : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int resultMax = maximum(a, b, c);
        System.out.println("Maximum number is " + resultMax);
        int resultMin = minimum(a, b, c);
        System.out.println("Maximum number is " + resultMin);

    }

    static int maximum(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    static int minimum(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }

}
