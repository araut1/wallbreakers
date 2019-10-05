class Solution {
     public int bsI(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {

            int mid = l + ((r - l) / 2);

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }


        }
        return -1;
    }


     public int bsR(int[] nums, int target, int l, int r) {

        if (l > r) {
            return -1;
        }

        int mid = l + ((r - l) / 2);

        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            return bsR(nums, target, l, mid - 1);
        } else {
            return bsR(nums, target, mid + 1, r);
        }


    }

     public int search(int[] nums, int target) {

     //   return bsI(nums, target);
       return bsR(nums, target, 0, nums.length - 1);

    }
}
