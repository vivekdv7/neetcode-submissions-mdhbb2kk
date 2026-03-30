class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int storage = 0;
            int l=0, r=n-1;
            while(l<r){
                int temp = Math.min(heights[l],heights[r]) * (r-l);
                storage = Math.max(temp, storage);
                if(heights[l] <= heights[r]){
                    l++;
                } else {
                    r--;
                }
            }
        return storage;
    }
}
