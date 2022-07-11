class Solution {
    public int trap(int[] height) {
        int left = 0; 
        int right = height.length - 1;
        
        int maxl = 0;
        int maxr = 0;
        
        int water = 0;
        while (left < right) {
            
            if (height[left] < height[right]) {
                if (height[left] > maxl) {
                    maxl = height[left];
                } else {
                    water = water + maxl - height[left];
                }
                left ++;
            } else {
                if (height[right] > maxr) {
                    maxr = height[right];
                } else {
                    water = water + maxr - height[right];
                }
                right --;
            }
        }
        
        return water;
        
    }
}