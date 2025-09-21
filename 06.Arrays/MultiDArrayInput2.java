import java.util.Arrays;

public class MultiDArrayInput2 {
    public static void main(String[] args) {
        // Example
        int[][] arr = { { 1, 2, 3 },
                { 4, 5 },
                { 6, 7, 8, 9 }
        };
        // printing using for loop
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------------");

        // printing using to string()
        for (int row = 0; row < arr.length; row++) {

            System.out.println(Arrays.toString(arr[row]));
        }

        System.out.println("-------------------------");

        // printing using for each loop
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }

    }
}
