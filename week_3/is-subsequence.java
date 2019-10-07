class Solution {
    public boolean isSubsequence(String s, String t) {
    
          if ((s == null || s.length() == 0) && (t == null || t.length() == 0)) {
            return true;
        }
        if ((s == null || s.length() == 0) ) {
            return true;
        }
        if ( (t == null || t.length() == 0)) {
            return false;
        }

        int j = 0;
        for (int i = 0; i < t.length(); i++) {

            char T = t.charAt(i);
            char S = s.charAt(j);

            if (S == T) {
                j++;
            }
            if (j == s.length()) {
                return true;
            }
        }

        return false;
    }
}
