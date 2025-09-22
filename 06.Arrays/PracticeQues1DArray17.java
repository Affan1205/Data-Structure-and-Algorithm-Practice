// Input: 5 then 1 2 0 3 0 → Count zeros: 2
public class PracticeQues1DArray17 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 3, 0 };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        System.out.println("0 -> " + count);
    }
}
