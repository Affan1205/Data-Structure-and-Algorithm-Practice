import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first number: ");
        float num1 = input.nextFloat();
        System.out.println("enter the second number: ");
        float num2 = input.nextFloat();
        float sum = num1 + num2;
        System.out.println("Sum is " + sum);
    }
}
