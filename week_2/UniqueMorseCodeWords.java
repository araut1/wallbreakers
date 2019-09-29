public class Solution {
    static public int uniqueMorseRepresentations(String[] words) {

        if (words == null || words.length == 0) {
            return 0;
        }

        String morse[] = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        Set<String> set = new HashSet<>();

        for (String word : words) {
            String temp = "";
            for (int i = 0; i < word.length(); i++) {

                char c = word.charAt(i);


                temp += morse[c - 'a'];

            }
            set.add(temp);
        }
        return set.size();
    }
    }
