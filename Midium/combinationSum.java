import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer> set=new ArrayList<>(); // store the subset of
        // sort
        Arrays.sort(candidates);
        // call functn
        backTracking(candidates,res,set,target,0);  //start=0
        return res;
    }

    static void backTracking(int[] candidates,List<List<Integer>>res,List<Integer> set,int target,int start){

        //after reducing the traget becomes less than 0
        if(target < 0){
            return;
        }
        
        if(target == 0){
            res.add(new ArrayList<>(set));
        }

        for(int i=start;i<candidates.length;i++){
            // add
            set.add(candidates[i]);
            //backtracking
            backTracking(candidates,res,set,target-candidates[i],i); // start not increase bcs same elemnt use again
            // remove
            set.remove(set.size()-1);   
        }
    }
}