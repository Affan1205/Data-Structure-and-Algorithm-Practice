//Alphabet case check

import java.util.Scanner;

public class LectureQues2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the character: ");
        char ch = input.next().trim().charAt(0);
        if (ch >= 65 && ch <= 90) {
            System.out.println(ch + " is uppercase.");
        } else if (ch >= 97 && ch <= 122) {
            System.out.println(ch + " is lowercase.");
        } else {
            System.out.println("Invalid Input.");
        }
    }
}
