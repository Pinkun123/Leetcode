class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int leftProduct=1;
        int rightProduct=1;

        int ans=nums[0]; // ans store first elment

        for(int i=0;i<n;i++){
            // if any elment of left and right product become is "0",then update 1
            leftProduct = leftProduct == 0 ? 1:leftProduct;
            rightProduct=rightProduct == 0 ? 1:rightProduct;

            // prifix Product
            leftProduct *=nums[i];

            // sufix Product
            rightProduct*=nums[n-1-i];

            // max product
            ans=Math.max(ans,Math.max(leftProduct,rightProduct));
        }
        return ans;
    }
}