import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int right=0;
        int left=0;
        int maxLength=0;
        while(right < s.length()){
            // check charcter
            if(!set.contains(s.charAt(right))){
               set.add(s.charAt(right));
               right++;
               int sz=set.size();
               maxLength=Math.max(maxLength,sz);
            }
            else{
                 set.remove(s.charAt(left));
                 left++;
            }
            
            
        }
        return maxLength;
    }
}