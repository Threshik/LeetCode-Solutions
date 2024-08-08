class Solution {
    static void find(List<List<Integer>> ans, List<Integer> ds,boolean[] vis,int[] nums)
    {
        if(ds.size()==nums.length)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!vis[i])
            {
                vis[i]=true;
                ds.add(nums[i]);
                find(ans,ds,vis,nums);
                //backtrack
                ds.remove(ds.size()-1);
                vis[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] vis = new boolean[nums.length];
        find(ans,ds,vis,nums);
        return ans;
    }
}