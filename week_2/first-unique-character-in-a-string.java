class Solution {
    
    public int firstUniqChar(String s) {
        Multiset<Character> multiset = new Multiset<>();
       
        for (int i = 0; i < s.length(); i++) {
            multiset.add(s.charAt(i));
        }
      
        for (int i = 0; i < s.length(); i++) {
          
            if (multiset.count(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
