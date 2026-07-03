class Solution {
    public int maxArea(int[] a) {
        int l=0;
        int r=a.length-1;
        int max=0;
        int cmax=0;
        while(l<r)
        {
          if(a[l]<a[r])
          {
            cmax=a[l]*(r-l);
            l++;
          }
          else
          {
            cmax=a[r]*(r-l);
            r--;
          }
          if(max<cmax)max=cmax;
        }
        return max;
        
    }
}