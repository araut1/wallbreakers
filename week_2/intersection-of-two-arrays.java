class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
          if (nums1.length == 0) {
            return nums1;
        }

        if (nums2.length == 0) {
            return nums2;
        }

        Set<Integer> set = new HashSet<>();
        Set<Integer> ans = new HashSet<>();
        for (int x : nums1) {
            set.add(x);
        }
        for (int x : nums2) {
            if (set.contains(x)) {
                ans.add(x);
            }
        }

        int[] res = new int[ans.size()];

        int i = 0;
        for (int x : ans) {
            res[i++] = x;
        }
        return res; 
    }
}
