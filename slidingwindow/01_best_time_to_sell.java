class Solution {
    public int maxProfit(int[] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
               int cmax=nums[j]-nums[i];
               if(max<cmax)
               {max=cmax;}
            }
        }
        return max;
    }
}



class Solution {
    public int maxProfit(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = 1;
        int sum = 0;
        while (right < n) {
            if (nums[left] > nums[right]) {
                left=right;
            }
            sum = Math.max(sum, nums[right] - nums[left]);
            right++;

        }

        return sum;
    }
}



class Solution {
    public int maxProfit(int[] nums) {
        int n = nums.length;
        int ans=0;
        int buy=nums[0];
        for(int i=1;i<n;i++)
        {
            ans=Math.max(nums[i]-buy,ans);
           
               buy=Math.min( buy,nums[i]);
        }

        return ans;
    }
}


