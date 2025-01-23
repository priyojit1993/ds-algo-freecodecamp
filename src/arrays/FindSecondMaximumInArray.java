package arrays;

public class FindSecondMaximumInArray {
    /*
     * take two variable
     * max=Integer.MIN_VALUE;
     * secondMax=Integer.MIN_VALUE;
     * loop the array if a[i]>max then max=a[i] and secondMax=max;
     *
     * */
    public static void findSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                secondMax = max;
                max = i;
            }
            else if (i > secondMax && i != max)
                secondMax = i;
        }
        System.out.println("secondMax = " + secondMax);
    }

    public static void main(String[] args) {
        int arr[] = {13, 34, 2, 35, 33, 1};
        findSecondMax(arr);
    }
}
