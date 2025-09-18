//Swapping of two numbers
public class PassbyValue {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before Swapping : " + a + " " + b);
        swap(a, b);
        System.out.println("After Swapping : " + a + " " + b);

    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

    }
}
