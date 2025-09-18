
public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(add(5, 3));
        System.out.println(add(5, 3, 8));
        System.out.println(add(5.4, 3.6));
    }
    // Add two Interger
    static int add(int a, int b) {
        return a + b;
    }
    // Add 3 Integer(different arguments)
    static int add(int a, int b, int c) {
        return a + b + c;
    }
    // Add two double(different datatypes)
    static double add(double a, double b) {
        return a + b;

    }
}
