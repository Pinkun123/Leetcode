class Solution {
    public int maxArea(int[] height) {
        int leftMax=0;
        int rightMax=height.length-1;
        int maxWater=0;

        while(leftMax <rightMax){
            int area=Math.min(height[leftMax],height[rightMax])*(rightMax-leftMax);
            
            maxWater=Math.max(area,maxWater);
            if(height[leftMax] < height[rightMax]){
                leftMax++;
            }
            else{
                rightMax--;
            }
        }
        return maxWater;
    }
}