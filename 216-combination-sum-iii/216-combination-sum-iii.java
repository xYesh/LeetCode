class Solution {
    
    List<List<Integer>> sol ;
    public List<List<Integer>> combinationSum3(int k, int n) {
        sol = new LinkedList<>();
        
        helper(k,n,new LinkedList<Integer>(),1);
        
        return sol;        
    }
    
    private void helper(int k, int remaining, LinkedList<Integer> list, int index) {
        if (list.size() == k && remaining == 0) {
            sol.add(new LinkedList(list));
            return;
        } else if (list.size() > k || remaining < 0) {
            return;
        }
        
        for (int i=index; i<=9; i++) {
            list.add(i);
            
            helper(k,remaining-i,list,i+1);
            
            list.removeLast();
        }        
    }
}



// class Solution {
//     protected void backtrack(int remain, int k,
//             LinkedList<Integer> comb, int next_start,
//             List<List<Integer>> results) {

//         if (remain == 0 && comb.size() == k) {
//             // Note: it's important to make a deep copy here,
//             // Otherwise the combination would be reverted in other branch of backtracking. 
//             results.add(new ArrayList<Integer>(comb));
//             return;
//         } else if (remain < 0 || comb.size() == k) {
//             // Exceed the scope, no need to explore further.
//             return;
//         }

//         // Iterate through the reduced list of candidates.
//         for (int i = next_start; i < 9; ++i) {
//             comb.add(i + 1);
//             this.backtrack(remain - i - 1, k, comb, i + 1, results);
//             comb.removeLast();
//         }
//     }

//     public List<List<Integer>> combinationSum3(int k, int n) {
//         List<List<Integer>> results = new ArrayList<List<Integer>>();
//         LinkedList<Integer> comb = new LinkedList<Integer>();

//         this.backtrack(n, k, comb, 0, results);
//         return results;
//     }
// }