class Solution {
    public boolean checkIfExist(int[] arr) {
        ArrayList<Integer> comp = new ArrayList();
        
        for (int num : arr) {
            
            if (comp.contains(num * 2) || (num % 2 == 0 && comp.contains(num/2))) {
                return true;
            }
            
            comp.add(num);
        }
        
        return false;
        
        
    }
}