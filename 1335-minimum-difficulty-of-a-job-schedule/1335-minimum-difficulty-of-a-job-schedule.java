class Solution {
    
    HashMap<String,Integer> map = new HashMap();
    public int minDifficulty(int[] jobDifficulty, int d) {
         map = new HashMap();
        if (jobDifficulty.length < d) {
            return -1;
        }
        
        return helper(jobDifficulty,d,0,1);
        
    }
    
    private int helper(int[] jobs, int d, int job, int day) {
        if(day == d) {
            int diff = -1;
            for (int i=job; i<jobs.length; i++) {
                diff = Math.max(diff,jobs[i]);
            }
            return diff;
        }
        
        if (map.containsKey(job + " " + day)) {
            return map.get(job + " " + day);
        }
        
        int best = Integer.MAX_VALUE;
        int hardest = 0;
        
        for (int i=job; i < (jobs.length - (d-day)); i++ ) {
            hardest = Math.max(hardest, jobs[i]);
            best = Math.min(best, hardest + helper(jobs,d,i+1,day+1));
        }
        
        map.put(job + " " + day , best);
        
        return best;
    }
}