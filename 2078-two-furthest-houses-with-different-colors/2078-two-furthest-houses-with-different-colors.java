// class Solution {
//     public int maxDistance(int[] colors) {
//         int sol = 0;
//         int currColor = -1;
//         for (int i=0; i<colors.length; i++) {
//             currColor = colors[i];
//             for (int j=i+1;j<colors.length;j++) {
//                 if (colors[j] != currColor) {
//                     sol = Math.max(sol, j-i);
//                 }
//             }
//         }
//         return sol;
//     }
// }

class Solution {
    public int maxDistance(int[] cs) {
        int n = cs.length, i = 0, j = n - 1;
        while (cs[0] == cs[j])
            --j;
        while (cs[n - 1] == cs[i])
            ++i;
        return Math.max(j, n - i - 1);     
    }
}