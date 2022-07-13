class Trie {

    TrieNode head;
    public Trie() {
        head = new TrieNode();
    }
    
    public void insert(String word) {
        
        TrieNode curr = head;
        for (char ch: word.toCharArray()) {
            
            if (!curr.contains(ch)) {
                curr.put(ch, new TrieNode());
            }
            
            curr = curr.get(ch);
        }
        
        curr.setEnd();
    }
    
    public boolean search(String word) {
        
        TrieNode res = searchPrefix(word);
        
        if (res == null) {
            return false;
        }
        
        return res.isEnd() ? true : false;
    }
    
    private TrieNode searchPrefix(String word) {
        TrieNode curr = head;
        for (char ch : word.toCharArray()) {
            if (!curr.contains(ch)) {
                return null;
            }
            
            curr = curr.get(ch);
        }
        
        return curr;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode res = searchPrefix(prefix);
        
        return res == null ? false : true;
    }
    
    
    private class TrieNode {
        
        TrieNode[] list;
        
        boolean isEndb = false;
        
        TrieNode() {
            list = new TrieNode[26];
        }
        
        private boolean contains(char ch) {
            return list[ch - 'a'] != null;
        }
        
        private void put(char ch, TrieNode n) {
            list[ch - 'a'] = n;
        }
        
        private TrieNode get(char ch) {
            return list[ch - 'a'];
        }
        
        private boolean isEnd() {
            return isEndb;
        }
        
        private void setEnd() {
            isEndb = true;
        }
        
    }
    
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */