class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;
        for(int key:nums)
        {
            product*=key;

        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=product/nums[i];
        }
        return nums;
        
    }
}