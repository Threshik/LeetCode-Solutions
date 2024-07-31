class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(sum>maxsum)
            maxsum=sum;
            if(sum<0)
            sum=0;
        }
        sum=0;
        for(int i=nums.length-1;i>=0;i--)
        {
            sum+=nums[i];
            if(sum>maxsum)
            maxsum=sum;
            if(sum<0)
            sum=0;
        }
        return maxsum;
        
    }
}