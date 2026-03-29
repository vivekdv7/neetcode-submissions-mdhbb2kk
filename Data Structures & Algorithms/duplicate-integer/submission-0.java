class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap map1 = new HashMap();
        for (int i=0; i< nums.length; i++){
            if(map1.containsKey(nums[i])){
                return true;    
            } 
            map1.put(nums[i], 0);
        }
        return false;
    }
}