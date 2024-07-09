class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum=0;
        int res=-1;
        int ans=0;
        int n = nums.length;
        int mindiff=Integer.MAX_VALUE;
        for(int i=0;i<n-2;i++)
        {
            int j=i+1;
            int k=n-1;
            while(j<k)
            {
                sum=nums[i]+nums[j]+nums[k];
                int diff = Math.abs(target-sum);
                if(diff<mindiff)
                {
                    res=sum;
                    mindiff=diff;
                }
                else if(diff==mindiff)
                {
                    if(sum<res)
                    res=sum;
                }
                if(sum<target)
                j++;
                else
                k--;
            }
        
        }
        return res;
    }
}