class Solution {
    public boolean isAnagram(String s, String t) {
           HashMap<Character,Integer> map1=new HashMap<>();
           HashMap<Character,Integer> map2=new HashMap<>();
           for(char ch:s.toCharArray()){
                if(map1.containsKey(ch)){
                    map1.put(ch,map1.get(ch)+1);
                    continue;
                }
                map1.put(ch,1);
           } 
           for(char ch:t.toCharArray()){
                if(map2.containsKey(ch)){
                    map2.put(ch,map2.get(ch)+1);
                    continue;
                }
                map2.put(ch,1);
           }
           return map1.equals(map2); 
    }
}
