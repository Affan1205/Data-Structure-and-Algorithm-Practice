//String Function with return statement

import java.util.Scanner;

public class FunctionBasics02 {
    public static void main(String[] args) {
        String name = naaam();
        System.out.println("Hi how are you? " + name);
    }

    static String naaam() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name: ");
        String str = input.nextLine();
        return str;
    }
}
