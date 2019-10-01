import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        HashSet<String> bannedWords = new HashSet<>();
        
        for (String s : banned) {
            bannedWords.add(s);
        }

        Multiset<String> multiset = new Multiset<>();

        String[] words = paragraph.split("\\W+");
        
        for (String word : words) {
            
            word = word.replaceAll("[^A-Za-z]+", "").toLowerCase();
            
            if (!bannedWords.contains(word)) {
                multiset.add(word);
            }
        }

        String mostCommonWord = "";
        int maxOccurrences = 0;
        
        for (String word : multiset.elementSet()) {
            
            if (multiset.count(word) > maxOccurrences) {
                mostCommonWord = word;
                maxOccurrences = multiset.count(word);
            }
        }
        return mostCommonWord;
    }
}
