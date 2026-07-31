class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
            int[] st1=new int[26];
            for(int i=0;i<s.length();i++){
                char ch1=s.charAt(i);
                st1[ch1-'a']++;
                char ch2=t.charAt(i);
                st1[ch2-'a']--;
            }
            for(int count:st1){
                if(count!=0){
                    return false;
                }
            }
            return true;
    }
}
