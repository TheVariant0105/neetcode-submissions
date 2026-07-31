class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
            int[] st1=new int[26];
            for(int i=0;i<s.length();i++){
                st1[s.charAt(i)-'a']++;
                st1[t.charAt(i)-'a']--;
            }
            for(int count:st1){
                if(count!=0){
                    return false;
                }
            }
            return true;
    }
}
