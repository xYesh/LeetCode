class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int sol = 0;
        for (int i=0; i<nums.length; i++) {
            boolean changed = false;
            for (int j=i; j<nums.length;j++) {
                
                if (nums[j] == 0) {
                    if (changed) {
                        break;
                    }
                    changed = true;
                }
                // System.out.println(i-j+1+"");
                sol = Math.max(sol, j - i +1);
                
            }
            
        }
        
        return sol;
        
        
    }
}