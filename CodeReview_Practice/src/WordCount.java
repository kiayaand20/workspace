import java.util.*;

public class WordCount {

    public static void main(String[] args) {
        String initialSentence = "Hello I love Boston. Yes, you do Love Boston.";

        String[] initialWordsInArray = initialSentence.toLowerCase().split("[, ?.@]+");

        List<String> initialWords = Arrays.asList(initialWordsInArray);

        HashMap<String, Integer> uniqueWordsMap = new HashMap<>();
        for (String word: initialWords) {
            if(uniqueWordsMap.containsKey(word)) {
                uniqueWordsMap.put(word, uniqueWordsMap.get(word) + 1);
            } else {
                uniqueWordsMap.put(word, 1);
            }
        }
        System.out.println(uniqueWordsMap);
    }
}

