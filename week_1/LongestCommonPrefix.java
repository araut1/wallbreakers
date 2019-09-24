class Solution {
    public String longestCommonPrefix(String[] strs) {
          if(strs.length == 0){
            return "";
        }

        String ans = "";

        String comp = strs[0];

        for (int i = 1; i < strs.length; i++) {

            int k = 0, j = 0;
            String current = strs[i];

            while (j < comp.length() && k < current.length()) {

                char compC = comp.charAt(j);
                char currentC = current.charAt(k);

                if (compC == currentC) {
                    j++;
                    k++;
                } else {
                    break;
                }
            }
            j--;
            k--;

            if (j == -1 && k == -1) {
                return "";
            }

            comp = "";

            for (int l = 0; l <= j; l++) {

                comp += current.charAt(l);
            }

        }

        return comp;
    }
}
