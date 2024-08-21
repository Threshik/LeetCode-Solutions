class Solution {
    public int findMaxK(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        list.add(nums[i]);
        for(int i=n-1;i>=0;i--)
        {
            if(list.contains(-nums[i]))
            return nums[i];
        }
        return -1;

        
    }
}