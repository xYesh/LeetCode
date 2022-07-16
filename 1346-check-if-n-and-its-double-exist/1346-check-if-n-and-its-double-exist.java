class Solution {
    public static boolean checkIfExist(int[] arr) {

        for (int i=0; i<arr.length;i++) {
            for (int j=1;j<arr.length;j++) {
                if (i == j) {
                    continue;
                } else {
                    if (arr[j] * 2 == arr[i] || arr[i] * 2 == arr[j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}