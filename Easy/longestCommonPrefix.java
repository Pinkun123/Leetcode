import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        //cret result strint to store result
        StringBuilder result=new StringBuilder();
        
        // sort the array
        Arrays.sort(strs);
        //get first and last index string from the array
        char first[]=strs[0].toCharArray();
        char last[]=strs[strs.length-1].toCharArray();

        // check the chacter same or not
        for(int i=0;i<first.length;i++){
            if(first[i] != last[i]){ // check first and last index first char 
               break;
            }
            else{
                result.append(first[i]);
            }
        }
        return result.toString();
    }
}