class Solution {
    public int findMinArrowShots(int[][] points) {
        
        Arrays.sort(points, (a,b) -> a[0] - b[0]);

       // sort by x_end
        Arrays.sort(points, (o1, o2) -> {
            // We can't simply use the o1[1] - o2[1] trick, as this will cause an 
            // integer overflow for very large or small values.
            if (o1[1] == o2[1]) return 0;
            if (o1[1] < o2[1]) return -1;
            return 1;
        });
        
        int currMax = points[0][1];
        int noOfArrows = 1;
        
        for (int i=0; i<points.length; i++) {
            // System.out.println(points[i][0] + " > " + currMax);
            if (points[i][0] > currMax) {
                noOfArrows ++;
                currMax = points[i][1];
            }
        }
        
        return noOfArrows;
        
    }
}