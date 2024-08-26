class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=Integer.MIN_VALUE;
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==1)
            count++;
            else
            count=0;
            if(count>max)
            max=count;
        }
        return max;
        
        
    }
}