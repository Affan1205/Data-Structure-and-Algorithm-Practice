//Define two methods to print the maximum and the minimum number respectively 
//among three numbers entered by the user.

import java.util.Scanner;

public class PracticeQuesFunction01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the three number: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        maximumNumber(a, b, c);
        minimumNumber(a, b, c);
    }

    static void maximumNumber(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a + " is largest ");
        } else if (b > c) {
            System.out.println(b + " is largest ");
        } else {
            System.out.println(c + " is largest ");
        }

    }

    static void minimumNumber(int a, int b, int c) {
        if (a < b && a < c) {
            System.out.println(a + " is smallest. ");
        } else if (b < c) {
            System.out.println(b + " is smallest. ");
        } else {
            System.out.println(c + " is smallest. ");
        }
    }

}
