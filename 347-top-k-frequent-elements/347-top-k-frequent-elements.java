class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap();
        
        for (int num: nums) {
            map.put(num,map.getOrDefault(num,0) + 1);
        }
        
        // System.out.println(map);
        
        PriorityQueue<Integer> q = new PriorityQueue((n1,n2) -> map.get(n2) - map.get(n1));
        
        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            q.add(entry.getKey());
        }
        
        int[] res = new int[k];
        for (int i=0;i<k;i++) {
            res[i] = q.poll();
        }
        
        return res;
        
    }
}