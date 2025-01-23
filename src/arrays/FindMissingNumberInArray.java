package arrays;

public class FindMissingNumberInArray {
    /*
     * given an array of n-1 distinct number in the range 1 to n find the missing number
     * {2,4,1,8,6,3,7} -> missing number is 5
     * logic -> (sum of n natural numbers)- (sum of array)
     * sum of natural numbers of n =n(n+1)/2
     * */
    public static void findMissingNumber(int[] arr) {
        int length = arr.length+1;
        int naturalSum = ((length) * (length + 1)) / 2;
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Missing number is " + (naturalSum - sum));
    }

    public static void main(String[] args) {
        int arr[]={2,4,1,8,6,3,7};
        findMissingNumber(arr);
    }
}
