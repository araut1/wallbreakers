class Solution {
    public int distributeCandies(int[] candies) {

        
         int len = candies.length;

        if (len == 0) {
            return 0;
        }


        HashSet<Integer> set = new HashSet<>();
        for (int candy : candies) {
            set.add(candy);
        }
        return Math.min(set.size(), len / 2);
    }
}
