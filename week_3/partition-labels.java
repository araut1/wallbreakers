class Solution {
    public List<Integer> partitionLabels(String s) {
             List<Integer> res = new ArrayList<>();
        int[] last = new int[26];


        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            last[c - 'a'] = i;

        }

        int i = 0, j = 0;
        

        while (i < s.length()) {
            int end = last[s.charAt(i) - 'a'];
            while (j <= end) {
                int cLast = last[s.charAt(j) - 'a'];
                if ( cLast > end) {
                    end = cLast;
                }
                j++;
            }
            res.add(j - i);
            i = j ;
        }


        return res;
    }
}
