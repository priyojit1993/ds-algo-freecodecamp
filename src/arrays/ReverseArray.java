package arrays;

import java.util.Arrays;

public class ReverseArray {
    /*
     * {1,2,3,4,5} -> {5,4,3,2,1}
     * algo -> go through the middle of the array and swap arr[i] with arr[length-i-1]
     *
     * */

    public static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6,7};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

}
