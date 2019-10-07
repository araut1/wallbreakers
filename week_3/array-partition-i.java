class Solution {
    public int arrayPairSum(int[] nums) {
                  if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);

        int sum = 0;

        for (int i = 0; i < nums.length-1 ; i++) {

            int min = Math.min(nums[i],nums[i+1]);
            sum+=min;
            i++;

        }
        return sum;
    }
}
