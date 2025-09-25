import java.util.Arrays;

public class PassinginFunction {
    public static void main(String[] args) {
        int nums[] = { 13, 34, 38, 78, 98 };
        System.out.println(Arrays.toString(nums));// [13, 34, 38, 78, 98]
        change(nums);
        System.out.println(Arrays.toString(nums));// [99, 34, 38, 1999, 98]

    }

    static void change(int[] arr) {
        arr[0] = 99;
        arr[3] = 1999;
    }
}
