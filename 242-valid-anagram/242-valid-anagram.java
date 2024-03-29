class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        if(s == null && t == null){
            return true;
        }
        
        Map<Character, Integer> maps = new HashMap<>();
        for(char c : s.toCharArray()){
            maps.put(c, maps.getOrDefault(c,0)+1);
        }
        
        Map<Character, Integer> mapt = new HashMap<>();
        for(char c : t.toCharArray()){
            mapt.put(c, mapt.getOrDefault(c,0)+1);
        }
        
        if(maps.equals(mapt)){
            return true;
        }else{
            return false;
        }
    }
}