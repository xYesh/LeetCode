class Solution {
    
//     List<List<Integer>> sol;
//     public List<List<Integer>> subsets(int[] nums) {
//         sol = new ArrayList<>();
//         for (int i=0; i<nums.length+1; i++) {
//             helper(0,nums,new ArrayList(),i);
//         }
//         return sol;
//     }
    
//     private void helper(int start, int[] nums, List<Integer> curr, int size) {
//         if (curr.size() == size) {
//             sol.add(new ArrayList(curr));
//             return;
//         }
        
//         for (int i = start; i<nums.length; i++) {
//             curr.add(nums[i]);
//             helper(i+1,nums,curr,size);
//             curr.remove(curr.size()-1);
//         }
//         return;
//     }
    
    
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> sol = new ArrayList<>();
        sol.add(new ArrayList());
        
        for (int num : nums) {
            List<List<Integer>> curr = new ArrayList<>();
            
            for (List<Integer> temp: sol) {
                List<Integer> ntemp = new ArrayList<>(temp);
                ntemp.add(num);
                curr.add(ntemp);
            }
            
            for (List<Integer> temp: curr) {
                sol.add(temp);
            }            
        }
        
        return sol;
        
    }
    
    
    
}