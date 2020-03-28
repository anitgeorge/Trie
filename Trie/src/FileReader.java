import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {
    //Known hard code dependency. Will fix later
    private static final Path filePath = Paths.get("c:/Users/anitg/IdeaProjects/Trie/resource", "words.txt");

    public void populateTrieFromFile(Trie trie) {

        try (Stream<String> lines = Files.lines(filePath)) {
            lines.forEach( line -> trie.insert(line.trim()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
