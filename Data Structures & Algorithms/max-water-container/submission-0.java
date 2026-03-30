class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int storage = 0;
        for(int i =0; i<n; i++){
            int l=i, r=i+1;
            while(l<r && r<n){
                int temp = Math.min(heights[l],heights[r]) * (r-l);
                storage = Math.max(temp, storage);
                r++;
            }
        }
        return storage;
    }
}
