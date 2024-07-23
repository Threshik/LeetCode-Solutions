class Solution {
    public void reverseString(char[] s) {
       int n = s.length;
       int left=0;
       int right=n-1;
       char temp;
       while(left<=right)
       {
        temp=s[left];
        s[left]=s[right];
        s[right]=temp;
        left++;
        right--;
       }
       for(int i=0;i<n;i++)
       {
        System.out.print(s[i]);
       }
        
    }
}