//largest among the number
public class LectureQues1 {
    public static void main(String[] args) {
        int a = 23, b = 43, c = 41;
        if (a > b && a > c) {
            System.out.println(a + " is largest.");
        }
        if (b > c) {
            System.out.println(b + " is largest.");
        } else {
            System.out.println(c + " is largest.");
        }
    }
}
