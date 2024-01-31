import java.util.*;
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        // creat empty list sotore the permutation
       List<Integer>permute=new ArrayList<>();

        Permutation(res,permute,nums);
        return res;
    }

    static void Permutation(List<List<Integer>> res,List<Integer>permute,int nums[]){
        // if permute length same is nums length
        if(permute.size() == nums.length){
            res.add(new ArrayList<>(permute));
        }

        for(int i=0;i<nums.length;i++){
            // skip we get same element
            if(permute.contains(nums[i])){
               continue;
            }

            // addd elment in permute
            permute.add(nums[i]);
            // backtracking
            Permutation(res,permute,nums);
            // remove elment form the permute
            permute.remove(permute.size()-1);
        }
    }
}