import java.util.*;
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
           List<List<Integer>>result=new ArrayList<>();
           List<Integer>set=new ArrayList<>();
           
           
           Subset(nums,result,set,0);
           return result;
    }
    static void Subset(int nums[],List<List<Integer>>result,List<Integer>set,int start){
        // add set in result
        result.add(new ArrayList<>(set));
        for(int i=start;i<nums.length;i++){
            // include 
            set.add(nums[i]);
            // backtracking
            Subset(nums,result,set,i+1);
            // exclude
            set.remove(set.size()-1);
        }
    }
}