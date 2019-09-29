class Solution {
    public boolean isIsomorphic(String s, String t) {
              if (s == null || t == null) {
            return false;
        }

              HashMap<Character, Character> map = new HashMap<>();
        char sChar;
        char tChar;
        for(int i =0;i<s.length();++i){
            sChar = s.charAt(i);
            tChar = t.charAt(i);
            if(map.get(sChar) == null){
                if(map.containsValue(tChar)){
                    return false;
                }
                map.put(sChar,tChar);
            }
            else if(tChar != map.get(sChar)){
                return false;
            }
        }
        return true;
 
    }
}
