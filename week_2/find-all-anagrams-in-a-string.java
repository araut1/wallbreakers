class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        Multiset<Character> pMultiset = multisetFromString(p);
        int start = 0;
        int end = p.length();
        List<Integer> result = new ArrayList<Integer>();
      
        if (s.length() < p.length()) {
            return result;
        }
        
        String substring = s.substring(start, end);
        Multiset<Character> token = multisetFromString(substring);
        
        while (end <= s.length()) {
           
            if (token.equals(pMultiset)) {
                result.add(start);
            }
            
            token.remove(s.charAt(start));
           
            if (end < s.length()) {
                token.add(s.charAt(end));
            }
            start++;
            end++;
        }
        return result;
    }

    public Multiset<Character> multisetFromString(String s) {

        Multiset<Character> multiset = new Multiset<>();

        for (char c : s.toCharArray()) {
            multiset.add(c);
        }
        return multiset;
    }
}
