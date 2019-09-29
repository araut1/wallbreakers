class Solution {
    public int numSpecialEquivGroups(String[] A) {
     Set<String> set = new HashSet();

        for (String s : A) {
            List<Character> even = new ArrayList<>();
            List<Character>
                    odd = new ArrayList<>();

            for (int i = 0; i < s.length(); ++i) {
                if (i % 2 == 0) {
                    even.add(s.charAt(i));
                } else {
                    odd.add(s.charAt(i));
                }
            }

            Collections.sort(even);
            Collections.sort(odd);


            set.add((String.valueOf(even) + String.valueOf(odd)));
        }
        return set.size();
    }
}
