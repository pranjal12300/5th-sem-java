/*3. Find the Missing Number in Range 1 to N 
Given an array of size n-1 containing numbers from 1 to n, find the missing number. 
Input: [1, 2, 4, 5, 6] → Output: 3 */


public class MissingNumber {
    public static int findMissingNumber(int[] arr, int n) {
        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return total - sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = 6; 
        System.out.println("Missing Number: " + findMissingNumber(arr, n));
    }
}
