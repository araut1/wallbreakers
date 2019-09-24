class Solution {
    public boolean isPalindrome(String s) {
         if (s == null || s.length() == 0) {
            return true;
        }
        int l = 0;
        int r = s.length() - 1;

        String str = s.toLowerCase();

        while (l < r) {

            char cl = str.charAt(l);
            char cr = str.charAt(r);

             if (!((cl >= 'a' && cl <= 'z') || (cl >= 'A' && cl <= 'Z') ||
                    (cl >= '0' && cl <= '9'))) {

                l++;
                continue;
            }


            if (!((cr >= 'a' && cr <= 'z') || (cr >= 'A' && cr <= 'Z') ||
                    (cr >= '0' && cr <= '9'))) {
                r--;
                continue;
            }

            if(cl != cr){
                return false;
            }
            l++;
            r--;
        }


        return true; 
    }
}
