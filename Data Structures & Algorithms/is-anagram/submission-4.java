class Solution {
    public boolean isAnagram(String s, String t) {
        if(s == null || t == null || s.length()!= t.length()){
            return false;
        }
        Map<Character, Integer> map1 = new HashMap();
        for(int i =0; i<s.length();i++){
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1 );
        }
        
        for(int i =0; i<t.length();i++){
            if(map1.containsKey(t.charAt(i)) && map1.get(t.charAt(i)) > 0){
                map1.put(t.charAt(i),map1.get(t.charAt(i)) -1);
            } else {
                return false;
            }
        }
    
        int total = 0;
        total = map1.values().stream().mapToInt(Integer::intValue).sum();
        if(total == 0) return true;
        return false;
    }
}
