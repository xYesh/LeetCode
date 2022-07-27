class Solution {
    public int openLock(String[] deadends, String target) {
        
        LinkedList<String> q = new LinkedList<>();
        
        Set<String> visited = new HashSet<>();
        
        Set<String> deadend = new HashSet<>();
        
        int[] directions = new int[] {-1, 1};
        
        for (String de : deadends) {
            deadend.add(de);
        }
        
        if (deadend.contains(target) || deadend.contains("0000")) {
            return -1;
        }
        
        q.add("0000");
        q.add(null);
        int sol = 0;
        while (!q.isEmpty()) {
            String curr = q.poll();
            // System.out.println(curr);

            if (curr == null) {
                sol ++;
                if (q.peek() != null) {
                    q.offer(null);
                }
            } else {
                if (curr.equals(target)) {
                    return sol;
                }
                
                if (deadend.contains(curr)) {
                    continue;
                }
                
                for (int i=0; i<4; i++) {
                                        
                    for (int direction : directions) {
                        
                        int newnum = ((curr.charAt(i) - '0') + direction + 10) % 10;
                        
                        String newlock = curr.substring(0,i) + newnum + curr.substring(i+1); 
                        
                        if (!visited.contains(newlock)) {
                            visited.add(newlock);
                            q.add(newlock);
                        }
                    }
                }
            }
        }
        return -1;            
        
    }
}