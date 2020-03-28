

public class Trie {

    private TrieNode root;

    Trie(){

        root = new TrieNode();
    }

    public void insert(String word){

        if(word == null || word.length() == 0) return;

        TrieNode curr = root;

        for(char ch : word.toCharArray()){
            ch = Character.toLowerCase(ch);
            curr.putIfAbsent(ch);
            curr = curr.getChild(ch);
        }

        curr.isEnd = true;

    }

    public boolean search(String word){

        TrieNode curr = root;

        for(char ch: word.toCharArray()){
            ch = Character.toLowerCase(ch);
            curr = curr.getChild(ch);
            if(curr == null)
                return false;
        }

        return curr.isEnd;
    }

    public boolean startsWith(String prefix) {
        TrieNode curr = root;
        for (char ch : prefix.toCharArray()) {
            ch = Character.toLowerCase(ch);
            curr = curr.getChild(ch);
            if (curr == null) {
                return false;
            }
        }
        return true;
    }
}
