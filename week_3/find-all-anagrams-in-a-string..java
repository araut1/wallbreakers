class Solution {
    public List<Integer> findAnagrams(String s, String p) {
                List<Integer> ans = new ArrayList<>();

        if (s == null || p == null) {
            return ans;
        }

        char[] pCharArr = p.toCharArray();
        Arrays.sort(pCharArr);
        String token = String.valueOf(pCharArr);
        int tokenLength = token.length();

        for (int i = 0; i <= s.length() - tokenLength; i++) {

            int start = i;
            int end = i + tokenLength;
            String current = s.substring(start, end);

            char[] currentCharArr = current.toCharArray();
            Arrays.sort(currentCharArr);
            String currentString = String.valueOf(currentCharArr);

            if (currentString.equals(token)) {
                ans.add(start);
            }
        }
        return ans;
    }
}
