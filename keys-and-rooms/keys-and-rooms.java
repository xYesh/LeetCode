class Solution {
    
    Set<Integer> keys;
    
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        keys = new HashSet<>();
        
        dfs(rooms,0);
        
        // System.out.println("keys = " + keys + " rooms = " + rooms);
        
        return keys.size() == rooms.size() - 1;
    }
    
    private void dfs(List<List<Integer>> rooms, int idx) {
        
        List<Integer> newKeys = rooms.get(idx);
        
        for (Integer newKey : newKeys) {
            
            if (newKey == 0) {
                continue;
            }
            
            if (!keys.contains(newKey)) {
                keys.add(newKey);
                dfs(rooms,newKey);
            }
        }
    }
}