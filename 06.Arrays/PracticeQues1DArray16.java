//Input: 4 then 5 4 2 1 → Output reverse: 1 2 4 5.

public class PracticeQues1DArray16 {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1 };
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
// Input: 5 then 1 2 0 3 0 → Count zeros: 2
