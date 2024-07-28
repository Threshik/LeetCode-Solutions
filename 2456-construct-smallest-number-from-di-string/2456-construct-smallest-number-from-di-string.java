class Solution {
    public String smallestNumber(String pattern) {
        int n = pattern.length();
        int[] nums =  new int[n+1];
        //filling the nums
        for(int i=0;i<=n;i++)
        nums[i]=i+1;

        for(int i=0;i<n;i++)
        {
           
           if(i<n && pattern.charAt(i)=='D')
           {
                int start =i;
                while(i<n && pattern.charAt(i)=='D')
                i++;
                swap(nums,start,i);
           }
        }
        String res="";
        for(int i=0;i<nums.length;i++)
        {
            res+=nums[i];
        }
        return res;
    }
    //swap logic
    void swap(int[] nums,int i,int j)
    {
        while(i<j)
        {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        i++;
        j--;
        }
        
    }
}