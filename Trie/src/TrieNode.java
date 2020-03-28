import java.util.HashMap;


/**
 * Class to specify the Node Structure
 */
public class TrieNode {

    private HashMap<Character, TrieNode> children;
    public boolean isEnd;

    TrieNode(){

        children = new HashMap<>();
    }

    public void putIfAbsent(char ch){

        children.putIfAbsent(ch, new TrieNode());
    }

    public TrieNode getChild(char ch){

        return children.get(ch);
    }
}
