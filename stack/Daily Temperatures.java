class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int []ans=new int[temp.length];
        for(int i=0;i<temp.length;i++)
        {
            int count=0;
            for(int j=i+1;j<temp.length;j++)
            {
                
                if(temp[i]<temp[j])
                {
                    ans[i]=j-i;
                    break;

                }
            }
            

        }
        return ans;
    }
}






class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int []ans=new int[temp.length];
        Deque<int[] >stack=new ArrayDeque<>();

        for(int i=0;i<temp.length;i++)
        {
           
            int te=temp[i];
            while(!stack.isEmpty()&&te>stack.peek()[0]){
            int []pair=stack.pop();
            ans[pair[1]]=i-pair[1];
            }
 stack.push(new int []{te,i});
        }
        return ans;
    }
}
