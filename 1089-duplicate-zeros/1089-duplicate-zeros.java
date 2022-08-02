class Solution {
    public void duplicateZeros(int[] arr) {
     
        int finalNo = 0;
        boolean firstSingleZero = false;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == 0) {
                finalNo++;
            }
            finalNo++;
            if (finalNo == arr.length) {
                finalNo = i;
                break;
            }
            if (finalNo > arr.length) {
                finalNo = i - 1;
                firstSingleZero = true;
                break;
            }
        }
        
        System.out.println(finalNo + " " + arr.length);
        
        int counter = arr.length-1;
        for (int i=finalNo; i >= 0; i--) {
            if (firstSingleZero) {
                arr[counter--] = 0;
                firstSingleZero = false;
            }
            arr[counter--] = arr[i];
            if (arr[i] == 0) {
                arr[counter--] = arr[i];
            }
        }
        
    }
}