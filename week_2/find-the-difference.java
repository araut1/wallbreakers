class Solution {

    public char findTheDifference(String s, String t) {

        Multiset<Character> sMultiset = new Multiset<>();
        for (int i = 0; i < s.length(); i++) {
            sMultiset.add(s.charAt(i));
        }
        Multiset<Character> tMultiset = new Multiset<>();
        for (int i = 0; i < t.length(); i++) {
            tMultiset.add(t.charAt(i));
        }

        if (sMultiset.elementSet().size() > tMultiset.elementSet().size()) {
            
            return getExtraLetter(sMultiset, tMultiset);
            
        } else if (tMultiset.elementSet().size() > sMultiset.elementSet().size()) {
            
            return getExtraLetter(tMultiset, sMultiset);
            
        }


        for (Character c : sMultiset.elementSet()) {
            if (sMultiset.count(c) != tMultiset.count(c)) {
                return c;
            }
        }
        return ' ';
    }

    public char getExtraLetter(Multiset<Character> larger, Multiset<Character> smaller) {
        for (Character c : larger.elementSet()) {
            if (!smaller.contains(c)) {
                return c;
            }
        }
        return ' ';
    }
}

