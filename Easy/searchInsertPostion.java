class Solution {
    public int searchInsert(int[] nums, int target) {
        // int n=nums.length;
        // int res=0;
        // for(int i=0;i<n;i++){
        //     if(nums[i]==target){
        //         res= i;
        //     }
        //     else if(nums[i] < target){
        //         res= i+1;
        //     }
        // }
        // return res;

        // binary serch
        
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid-1;
            else start = mid+1;
        }

        return start;
    }
}