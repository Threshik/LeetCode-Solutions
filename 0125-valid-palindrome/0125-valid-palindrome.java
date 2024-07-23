class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='0' && str.charAt(i)<='9')
            {
                res.append(str.charAt(i));
            }
        }
        String st = res.toString();
        String rev = res.reverse().toString();
        if(st.equals(rev))
        return true;
        return false;
    }
}