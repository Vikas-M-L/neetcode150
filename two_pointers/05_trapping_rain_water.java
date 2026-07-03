class Solution {
    public int trap(int[] a) {
        int lmax = 0;
        int rmax = 0;
        int left = 0;
        int right = a.length - 1;
        int max = 0;
        int cmax = 0;
        while (left < right) {
            if (a[left] < a[right])

            {
                cmax = 0;
                if (lmax < a[left]) {
                    lmax = a[left];
                } else {
                    cmax = lmax - a[left];
                }
                left++;
                max += cmax;
            } else {
                cmax=0;
                if (rmax < a[right]) {
                    rmax = a[right];
                } else {
                    cmax = rmax - a[right];
                }
                max += cmax;
                right--;
            }
        }
        return max;
    }
}