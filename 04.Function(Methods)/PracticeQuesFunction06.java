//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.4
import java.util.Scanner;
public class PracticeQuesFunction06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the radiurs: ");
        double radius = input.nextDouble();
        double area = areaCircle(radius);
        double circumference = circumferenceCircle(radius);
        System.out.printf("Area of circle is %.3f%n" , area);
        System.out.printf("circumference of circle is %.3f%n" , circumference);
    }

    static double areaCircle(double r) {
        double area = Math.PI * Math.pow(r, 2);
        return area;
    }

    static double circumferenceCircle(double r) {
        double circum = 2 * Math.PI * r;
        return circum;
    }

}
