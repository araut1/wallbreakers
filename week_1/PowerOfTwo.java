class Solution {
    public boolean isPowerOfTwo(int n) {
        
                  boolean is = false;

            if (n % 2.0 == 1 && n > 1) {
                return false;

            }

            if (n == 1) {
                return true;
            }
           if (n == 0) {
                return false;
            }

            if (isPowerOfTwo(n / 2)) {
                return true;
            }

            return is;
        
    }
}
