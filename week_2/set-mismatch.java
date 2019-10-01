class Solution {
    
    public int[] findErrorNums(int[] nums) {
      
        Multiset<Integer> multiset = new Multiset<>();
      
        for (int num : nums) {
            multiset.add(num);
        }
      
        int[] ans = new int[2];
       
        for (int i = 1; i <= nums.length; i++) {
            if (!multiset.contains(i)) {
                ans[1] = i;
            } else if (multiset.count(i) == 2) {
                ans[0] = i;
            }
        }
        return ans;
    }
}
