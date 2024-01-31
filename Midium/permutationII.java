import java.util.*;
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        // creat empty list sotore the permutation
        List<Integer> permute = new ArrayList<>();
        //sort the arr
        Arrays.sort(nums);
        boolean used[]=new boolean[nums.length];
        Permutation(res, permute,used, nums);
        return res;
    }
    
    static void Permutation(List<List<Integer>> res,List<Integer> permute,boolean used[],int nums[]){
        //we macth legth is same it is permutation
        if(permute.size() == nums.length && !res.contains(permute)){
            res.add(new ArrayList<>(permute));
            return;
        }

        for(int i=0;i<nums.length;i++){
            // skip we get same elment
            if(used[i]){
                continue;
            }

            // add
            used[i]=true;
            permute.add(nums[i]);

            // backtarcking
            Permutation(res,permute,used,nums);

            // remove elment 
            used[i]=false;
            permute.remove(permute.size()-1);
        }
    }
}