// Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class PracticeQuesJava2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter yout name: ");
        String name = input.nextLine();
        System.out.println("Hello !! " + name);
    }

    
}
