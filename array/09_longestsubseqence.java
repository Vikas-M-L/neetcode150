class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int max = 0;
        int cmax = 0;
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }
        int prev = 0;
        int count = 0;
        for (int ele : set) {
            if (count == 0) {
                cmax++;
            } else {
                if (ele - prev == 1) {
                    cmax++;
                } else {
                    cmax = 1;
                }
            }
            prev = ele;
            count++;
            if (max < cmax)
                max = cmax;
        }
        //  System.out.println(fele);
        return max;
    }
}








class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int max = 0;
        int cmax = 0;
        Arrays.sort(nums);
        int prev = 0;
        int count = 0;
        for (int i = 0; i < n; ++i) {
            int ele = nums[i];
            if (count == 0) {
                cmax++;
            } else if (prev == ele) {
                continue;
            } else {
                if (ele - prev == 1) {
                    cmax++;
                } else {
                    cmax = 1;
                }
            }
            prev = ele;
            count++;
            if (max < cmax)
                max = cmax;
        }
        //  System.out.println(fele);
        return max;
    }
}
