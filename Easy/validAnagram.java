class Solution {
    public boolean isAnagram(String s, String t) {
        // convert both String all chacter in lower
        String str1=s.toLowerCase();
        String str2=t.toLowerCase();

        //remove whide space in both String
         str1=s.replaceAll(" "," ");
         str2=t.replaceAll(" "," ");

        // store the feequency in the arry
        int freq[]=new int[26];

        //add str1 freq in freq array
        for(int i=0;i<str1.length();i++){
            freq[str1.charAt(i)-'a']++;
        }  

        // remove str2 frequncy in the array
        for(int i=0;i<str2.length();i++){
            freq[str2.charAt(i)-'a']--;
        }  


        // check freq or count same
        for(int count :freq){
            if(count != 0){
                return false;
            }
        } 
        return true;
    }
}