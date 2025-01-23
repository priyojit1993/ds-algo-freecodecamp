package arrays;

public class FindMinInArray {
    /*
     * logic set min=Integer.Max
     * loop though the array
     * if a[i] is less than min then min=a[i]
     * */
    public static void findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i < min)
                min = i;
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        int[] ints = {1, 3, -9, 5, 44};
        findMin(ints);
    }
}
