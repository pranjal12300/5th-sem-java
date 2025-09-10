/*2. Kadane’s Algorithm for Maximum Subarray Sum 
Implement Kadane's Algorithm to find the contiguous subarray with the maximum sum. 
Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4] → Output: 6 (Subarray: [4, -1, 2, 
1])*/

public class KadanesAlgorithm {
    public static void maxSubArray(int[] nums) {
        int maxSoFar = nums[0], maxEndingHere = nums[0];
        int start = 0, end = 0, tempStart = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxEndingHere + nums[i]) {
                maxEndingHere = nums[i];
                tempStart = i; 
            } else {
                maxEndingHere += nums[i]; 
            }
            if (maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
                start = tempStart;
                end = i;
            }
        }
        System.out.println("Maximum Subarray Sum: " + maxSoFar);
        System.out.print("Subarray: [");
        for (int i = start; i <= end; i++) {
            System.out.print(nums[i]);
            if (i < end) System.out.print(", ");
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        maxSubArray(arr);
    }
}
