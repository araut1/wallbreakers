class Solution {
    public String reverseWords(String s) {
        
        char[] str = s.toCharArray();

        List<Character> ans = new ArrayList<>();
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }

        //////////////////////////////
        i = str.length - 1;
        j = i;
        int k;

        while (i >= 0) {

            while (j >= 0 && str[j] != ' ') {
                j--;
            }

            for (k = j + 1; k <= i; k++) {
                ans.add(str[k]);
            }
            ans.add(' ');
            j -= 1;
            i = j;
        }


        ///////////////////////////////


        char[] rre = new char[s.length() + 1];

        int in = 0;
        for (Character c : ans) {
            rre[in] = (char) c;
            in++;
        }
        return String.valueOf(rre).trim();
    }
}
