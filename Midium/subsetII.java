import java.util.*;
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer>set=new ArrayList<>();
        // sort the nums
        Arrays.sort(nums);
        // call the subSet function
        subSet(nums,result,set,0);  // start=0
        return result;
    }

    static void subSet(int nums[],List<List<Integer>> result, List<Integer>set,int start){
        //befor adding check set present or not in result
        if(result.contains(set)){
            return;
        }

        // add in result
        result.add(new ArrayList<>(set));

        // loop
        for(int i=start;i<nums.length;i++){
            // include or addd
            set.add(nums[i]);
            // backtracking
            subSet(nums,result,set,i+1);
            //exclude
            set.remove(set.size()-1);
        }
    }
}