class MapSum {

    HashMap<String,Integer> map;
    TrieNode head;
    public MapSum() {
        map = new HashMap();
        head = new TrieNode();
    }
    
    public void insert(String key, int val) {
        int delta = val - map.getOrDefault(key,0);
        map.put(key,val);
        head.score = head.score + delta;
        
        TrieNode curr = head;
        for (char ch : key.toCharArray()) {
            curr.children.putIfAbsent(ch, new TrieNode());
            curr.children.get(ch).score = delta + curr.children.get(ch).score;
            curr = curr.children.get(ch);           
        }
    }
    
    public int sum(String prefix) {
        
        TrieNode curr = head;
        int score = head.score;
        for (char ch : prefix.toCharArray()) {
            if (!curr.children.containsKey(ch)) {
                return 0;
            }
            score = curr.children.get(ch).score;
            curr = curr.children.get(ch);
        }
        return score;
         
    }
    
    private class TrieNode {
        
        int score;
        HashMap<Character,TrieNode> children = new HashMap();
        
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */