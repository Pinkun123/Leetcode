class Solution {
    public int missingNumber(int[] nums) {
    //     Arrays.sort(nums);
    //     for(int i=0;i<nums.length-1;i++){
    //         if(nums[i+1] - nums[i] != 1){
    //             return (nums[i]+1);
    //         }
    //     }
    //     return(-1);
    // }
    int n=nums.length;
    int totalsum=(n*(n+1))/2;
    int currsum=0;
    for(int i=0;i<n;i++){
        currsum+=nums[i];
        
    }
    return(totalsum -currsum);
 }
}