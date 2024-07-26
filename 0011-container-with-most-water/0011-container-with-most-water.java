class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int max=Integer.MIN_VALUE;
        int i=0;
        int j=n-1;
        while(i<j)
        {
            int diff=j-i;
            int min =Math.min(height[i],height[j]);
            if(diff*min>max)
            max=diff*min;
            if(min==height[i])
            i++;
            if(min==height[j])
            j--;
        }
        return max;
    }
}