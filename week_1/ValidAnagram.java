class Solution {
    public boolean isAnagram(String s, String t) {
               boolean isA = true;
        int temp = 0;

        Map<Character, Integer> map = new HashMap<>();

        if (s == null || t == null || s.length() != t.length()) {

            return false;
        }

        for (int i = 0; i < s.length(); i++) {

            if (map.containsKey(s.charAt(i))) {

                temp = map.get(s.charAt(i));
                temp++;
                map.put(s.charAt(i), temp);

            } else {
                map.put(s.charAt(i), 1);
            }

        }

        for (int i = 0; i < t.length(); i++) {

            if (map.containsKey(t.charAt(i))) {

                temp = map.get(t.charAt(i));
                temp--;
                map.put(t.charAt(i), temp);

            }

        }

        for (Integer x : map.values()) {

            if(x != 0){
                return false;
            }

        }


        return isA;
    }
}
