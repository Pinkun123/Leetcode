import java.util.*;
class Solution {
    public int maxOperations(int[] nums, int k) {
        // Sort the array for an organized approach
        Arrays.sort(nums);
        
        // Initialize the count of operations
        int count = 0;
        
        // Two pointers: one starting from the beginning and one from the end
        int leftPointer = 0;
        int rightPointer = nums.length - 1;
        
        // Move pointers towards each other
        while (leftPointer < rightPointer) {
            // Calculate the sum of elements at the pointers
            int sum = nums[leftPointer] + nums[rightPointer];
            
            // Check if the sum equals the target value
            if (sum == k) {
                // Increment count and move pointers to explore more pairs
                count++;
                leftPointer++;
                rightPointer--;
            } else if (sum > k) {
                // If sum is too large, move the right pointer towards smaller values
                rightPointer--;
            } else {
                // If sum is too small, move the left pointer towards larger values
                leftPointer++;
            }
        }
        
        // Return the total count of operations
        return count;
    }
}