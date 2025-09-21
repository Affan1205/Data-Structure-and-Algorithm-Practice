import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // -----> array of Primitives <-----
        int[] arr = new int[5];
        arr[0] = 912;
        arr[1] = 212;
        arr[2] = 142;
        arr[3] = 122;
        arr[4] = 612;
        System.out.println(arr[3]);
        // System.out.println(arr[8]);// index out of bound

        // Input using for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        //Printing using for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        // Printing using for each loop
        for (int num : arr) {// for every element in the array print the array
            System.out.print(num + " ");// here num represent the element of array
        }

        // Input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        // Printing using (to string)
        System.out.println(Arrays.toString(arr));

        // -----> array of object <-----
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));
        // Modify
        str[2] = "Pbc";
        System.out.println(Arrays.toString(str));
    }
}
