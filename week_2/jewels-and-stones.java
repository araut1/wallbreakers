class Solution {
    public int numJewelsInStones(String J, String S) {
        
        
             int numJewels = 0;

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < J.length(); i++) {
            
            set.add(J.charAt(i));

        }

        for (int i = 0; i < S.length(); i++) {
            if(set.contains(S.charAt(i))){
                numJewels++;
            }
        }


        return numJewels;           
        
                      
        
        
    }
}
