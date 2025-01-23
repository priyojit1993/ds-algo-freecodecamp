package arrays;

import java.util.Arrays;

public class RemoveZeroToEndOfArray {
    /*
     * {8,1,0,2,1,0,3}-> {8,1,2,1,3,0,0}
     * take two pointer i and j loop through the array
     * if(arr[i]!=0 and arr[j]==0) -> swap(arr[i],arr[j])
     * if(arr[j]!=0) -> j++
     * */
    public static void moveZeroToEnd(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0)
                j++;
        }
    }

    public static void main(String[] args) {
        int arr[] = {8, 1, 0, 2, 1, 0, 3};
        System.out.println(Arrays.toString(arr));
        moveZeroToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}
