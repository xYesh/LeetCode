class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int c1 = m-1;
        int c2 = n-1;
        // System.out.println(c1 + " " + c2 + " " + le);
        for (int i=nums1.length-1; i>=0;i--) {
            if (c1 < 0 || c2 < 0) {
                if (c1 < 0) {
                    nums1[i] = nums2[c2--];
                } else {
                    nums1[i] = nums1[c1--];
                }
            } else if (nums1[c1] > nums2[c2]) {
                nums1[i] = nums1[c1--];
            } else {
                nums1[i] = nums2[c2--];
            }
        }
        
    }
}