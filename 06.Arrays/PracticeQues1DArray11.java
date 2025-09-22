//Read N and N integers, then print elements at even indices (0,2,4,...) on one line. Aim: step by 2.

public class PracticeQues1DArray11 {
    public static void main(String[] args) {
        int[] arr = { 23, 4, 78, 89, 98, 3 };
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }
}
