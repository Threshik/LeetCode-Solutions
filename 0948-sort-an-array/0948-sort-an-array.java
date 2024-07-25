class Solution {
    public int[] sortArray(int[] nums) {
       PriorityQueue<Integer> pq = new PriorityQueue<>();
       int n = nums.length;
       int k=0;
       int[] arr = new int[n];
       for(int i=0;i<n;i++)
       {
        pq.add(nums[i]);
       }
       while(pq.size()!=0)
       {
        int num=pq.poll();
        arr[k++]=num;
       } 
       return arr;
    }
}