class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        // set elemnt majrity=nums[i] and vote=1;
        int majority=nums[0]; 
        int vote=1;

        for(int i=1;i<n;i++){
            //if vote zero vote is update and majority store this element
            if(vote == 0){
                vote++;
                majority=nums[i];
            }
            else if(majority == nums[i]){ // if elemnt == majority then increment vote
                vote++;
            }
            else{// if elemnt  != majority then decrement vote
                vote--;
            }
        }
        return majority;
    }
}