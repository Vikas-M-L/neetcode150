class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
             for(int j=i+1;j<n;j++)
             {
                if(nums[i]==nums[j])
                {
                    return true;
                }
             }
        }
        return false;
    }
}


class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                return true;
            }
        }
        return false;
    }
}





class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        Set <Integer> contain=new HashSet<>();
        for(int i=0;i<n;i++)
        {
             contain.add(nums[i]);
        }
        if(contain.size()==n)
        {
            return false;
        }
        return true;
    }
}