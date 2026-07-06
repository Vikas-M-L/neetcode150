
 //brute force

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];

        for (int i = 0; i <= nums.length - k; i++) {
            int max = nums[i];
            for (int j = i + 1; j < k + i; j++) {
                max = Math.max(nums[j], max);
            }
            ans[i] = max;

        }
        return ans;

    }
}
