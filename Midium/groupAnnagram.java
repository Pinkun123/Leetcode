import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // check String empty or not
        // if( strs == null || strs.length == 0){
        //     return new ArrayList<>();
        // }

        // // creat hashmap key and value
        // HashMap<String,list<String>> frequencyStringmap=new HashMap<>();

        // for(String str : strs){
        //     String freqString=getFrequencyString(str);

        //     // check map conatin freqstring
        //     if(frequencyStringmap.containskey(freqString)){
        //         frequencyStringmap.get(freqString).add(str);
        //     }
        //     //create new linklist
        //     else{
        //         list<String>strlst=new ArrayList<>();
        //         strlst.add(str);
        //         frequencyStringmap.put(freqString,strlst);
        //     }
        // }
        // return new ArrayList<>(freqString.values());
        
        Map<String, List<String>> map = new HashMap<>();
        
        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            
            map.get(sortedWord).add(word);
        }
        
        return new ArrayList<>(map.values());

    }
}