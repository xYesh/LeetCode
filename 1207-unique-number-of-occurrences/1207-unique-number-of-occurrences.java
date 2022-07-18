class Solution {
    public boolean uniqueOccurrences(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap();
        for (int num: nums) {
            map.put(num,map.getOrDefault(num,0) + 1);
        }
        
        Set<Integer> s = new HashSet(map.values());
        
        return s.size() == map.size();
    }
}