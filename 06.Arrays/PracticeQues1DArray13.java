//Read N and N integers, then print “YES” if a given X (read X) exists in the array, else “NO”.
//  Aim: early detection or full scan.

import java.util.Scanner;

public class PracticeQues1DArray13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("enter the element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextInt();
        }
        System.out.println("enter the number you want to check if it peresent in array or not :");
        int num = input.nextInt();
        boolean result = isElementExist(arr,num);
        if (result) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    static boolean isElementExist(int[] arr , int num ){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}
