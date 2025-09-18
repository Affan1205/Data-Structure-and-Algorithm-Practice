// smaller type to larger type, done automatically; 
// sequence is byte → short → char → int → long → float → double.
public class Wideningcasting {
    public static void main(String[] args) {
        int a = 42;
        double b = a; // 42 becomes 42.0
        long l = a; // fits safely
        System.out.println(b);
        System.out.println(l);

    }
}
