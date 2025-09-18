//Subtract the Product and Sum of Digits of an Integer
public class PracticeQuesConditional1 {
    public static void main(String[] args) {
        int num = 234;
        int sum = 0;
        int product = 1;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        int sub = product - sum;
        System.out.println(sub);
      
    }
}
