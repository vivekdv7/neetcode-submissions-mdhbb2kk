class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if(strs.length == 0) return result;
        if(strs.length == 1) {
            result.add(List.of(strs));
            return result;
        }
        Map<String, ArrayList<String>> map1 = new HashMap();
        for(String s: strs){
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String key = new String(charArr);
            if(map1.containsKey(key)){
                ArrayList value = map1.get(key);
                value.add(s);
                map1.put(key, value);
            } else {
                ArrayList<String> value = new ArrayList<>();
                value.add(s);
                map1.put(key, value);
            }
        }
        for(String k: map1.keySet()){
            result.add(map1.get(k));
        }

        return result;
    }
}
