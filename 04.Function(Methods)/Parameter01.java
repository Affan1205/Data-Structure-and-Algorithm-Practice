//Ex-Integer parameters
public class Parameter01 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int ans = sum(a, b);
        System.out.println("sum of " + a + " and " + b + " is " + ans);
    }

    static int sum(int a, int b) {
        int addition = a + b;
        return addition;
    }

    // --------Example---------
    // public static void main(String[] args) {
    // sum(10, 20);
    // sum(40, 50);
    // sum(180, 20);
    // }

    // static void sum(int a, int b) {
    // int sum1 = a + b;
    // System.out.println("sum of " + a + " and " + b + " is " + sum1);
    // }
}
