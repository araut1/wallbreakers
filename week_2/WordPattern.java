class Solution {
    public boolean wordPattern(String pattern, String str) {
        
        
                Map<String, Character> map = new HashMap<>();
        boolean[] p = new boolean[26];
        String[] s = str.split(" ");

        if(s.length != pattern.length())
            return false;

        for(int i = 0; i < s.length; ++i){
            char c = pattern.charAt(i);
            String current = s[i];

            Character x = map.get(current);
            if(x == null){
                if(p[c - 'a'])
                    return false;

                map.put(current, c);
                p[c - 'a'] = true;
                continue;
            }
            if(!x.equals(c))
                return false;
        }

        return true;
        
        
    }
}
