class Solution {

    String answer = "";

    public String longestWord(String[] words) {

        TrieNode root = new TrieNode();
        for (String word : words) {
            TrieNode current = root;
            for (char c : word.toCharArray()) {
                if (current.childes[c - 'a'] == null) {
                    current.childes[c - 'a'] = new TrieNode();
                }
                current = current.childes[c - 'a'];
            }
            current.completeWord = true;
        }
        traverseTrie(root, new StringBuilder());
        return answer;
    }

    private void traverseTrie(TrieNode node, StringBuilder path) {
        for (char i = 0; i < 26; i++) {
            TrieNode c = node.childes[i];
            if (c != null && c.completeWord) {
                path.append(Character.toString((char) ((char) i + 'a')));
                if (path.length() > answer.length()) {
                    answer = path.toString();
                } else if (path.length() == answer.length() && path.toString().compareTo(answer) < 0)
                    answer = path.toString();

                traverseTrie(c, path);
                path.setLength(path.length() - 1);
            }
        }
    }

    public class TrieNode {
        TrieNode[] childes;
        boolean completeWord;

        public TrieNode() {
            completeWord = false;
            childes = new TrieNode[26];
        }
    }
}
