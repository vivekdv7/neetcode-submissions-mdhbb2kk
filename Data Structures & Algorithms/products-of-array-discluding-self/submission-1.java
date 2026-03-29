class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.fill(res, 1);
        for(int i=0; i<nums.length;i++){
            int l=i-1,r=i+1;
            while (r < nums.length) {
                res[i] *= nums[r];
                r++;
            }
            while(l>=0){
                res[i] *= nums[l];
                l--;
            }
        }
    return res;
    }
}  
