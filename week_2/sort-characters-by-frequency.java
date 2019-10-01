class Solution {
        public String frequencySort(String s) {
            
            Multiset<Character> multiset = new Multiset<>();
          
            for (int i = 0; i < s.length(); i++) {
                multiset.add(s.charAt(i));
            }
           
            StringBuilder ans = new StringBuilder();
            
            while (multiset.size() > 0) {
                
                Character c = ' ';
                int count = 0;
                
                for (Character x : multiset.elementSet()) {
                    if (multiset.count(x) > count) {
                        c = x;
                        count = multiset.count(x);
                    }
                }
                
                for (int i = 0; i < count; i++) {
                    ans.append(c);
                    multiset.remove(c);
                }
            }
          
            return ans.toString();
        }
    }
