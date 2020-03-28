import java.lang.invoke.StringConcatException;

class Main {

    private static FileReader reader;
    private static Trie trie;


    public static void main(String[] args){

        trie = new Trie();
        reader = new FileReader();
        reader.populateTrieFromFile(trie);

        if(trie.search("Tea")){

            System.out.println("Trie Search Works");
        } else{

            System.out.println("Trie is faulty");
        }

        if(trie.startsWith("sear")){

            System.out.println("Trie prefix Works");
        } else{

            System.out.println("Trie prefix is faulty");
        }
    }
}
