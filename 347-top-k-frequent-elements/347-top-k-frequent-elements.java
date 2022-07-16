import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap();

        for (int num: nums) {
            map.put(num,map.getOrDefault(num,0) + 1);
        }

        ArrayList<Integer>[] bucket = new ArrayList[nums.length+1];

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (bucket[entry.getValue()] == null) {
                bucket[entry.getValue()] = new ArrayList<>();
            }

            bucket[entry.getValue()].add(entry.getKey());
        }

        int tempk = k;
        int[] res = new int[k];
        int counter = 0;
        for (int i=nums.length; i>=0; i--) {

            if (bucket[i] != null) {
                ArrayList<Integer> temp = bucket[i];
                
                for (int t:temp) {
                    if (counter == k) {
                        break;
                    }
                    res[counter] = t;
                    counter++;

                }
            }

        }

        return res;

    }
}