class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res=new ArrayList<>();
        int curr=1;
        for(int nums:target){
            while(curr < nums){
                res.add("Push");
                res.add("Pop");
                curr++;
            }
            res.add("Push");
            curr++;
        }
        return res;
    }
}