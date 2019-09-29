class Solution {
    public boolean isHappy(int n) {
         int sum = 0;

        Set<Integer> set = new HashSet<>();

        while (true) {
            sum = 0;
            while (n != 0) {

                sum += (n % 10) * (n % 10);
                n = n / 10;
            }

            if (set.contains(sum)) {
                break;
            } else if (sum == 1) {
                return true;
            } else {
                set.add(sum);
            }
            n = sum;
        }
        return false;  
    }
}
