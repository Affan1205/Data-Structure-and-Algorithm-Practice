// Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class PracticeQues02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name: ");
        String name = input.nextLine();
        greeting(name);
    }

    static void greeting(String name) {
        System.out.println("Hi " + name + " welcome to Rubrik.");
    }
}
