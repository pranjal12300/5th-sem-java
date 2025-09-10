/*1. Find Equilibrium Index 
Find an index i such that the sum of elements at lower indexes is equal to the sum at 
higher indexes. 
Input: [1, 3, 5, 2, 2] → Output: 2 */

public class EquilibriumIndex {
    public static int findEquilibriumIndex(int[] arr) 
    {
        int total = 0, leftSum = 0; 
        for (int num : arr) total += num; 
        for (int i = 0; i < arr.length; i++) 
        {
            total -= arr[i];
            if (leftSum == total) return i;
            leftSum += arr[i];
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        int[] arr = {1, 3, 5, 2, 2};
        int index = findEquilibriumIndex(arr);
        if (index != -1) 
        {
            System.out.println("Equilibrium Index: " + index);
        } 
        else 
        {
            System.out.println("No equilibrium index found.");
        }
    }
}
