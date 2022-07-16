class Solution {
    public int[] replaceElements(int[] arr) {
        
        int ge = arr[0];
        
        for (int i=0; i<arr.length-1;i++) {
            if (arr[i] < ge) {
                arr[i] = ge;
            } else if (arr[i] == ge) {
                ge = 0;
                for (int j=i+1; j<arr.length;j++) {
                    ge = Math.max(ge,arr[j]);
                }
                arr[i] = ge;
            }
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}