class Solution {
    public String reverseStr(String s, int k) {
       StringBuilder sb = new StringBuilder(s);
       StringBuilder temp = new StringBuilder();
       StringBuilder res = new StringBuilder();
       String r="";
       int n = s.length();
       if(n<k)
       {
        return sb.reverse().toString();
       } 
       else if(n<2*k && n>=k)
       {
        for(int i=0;i<k;i++)
        {
            temp.append(s.charAt(i));
        }
        temp.reverse();
        for(int i=k;i<n;i++)
        {
            temp.append(s.charAt(i));
        }
        return temp.toString();
       }
       else
       {
         for(int i=0;i<n;i+=2*k)
         {
            int end=i+k<n?i+k:n;
            StringBuilder tem = new StringBuilder(s.substring(i,end)); 
            r+=tem.reverse();
            if(i+k>=n)
            break;
            if(i+2*k<n)
            r+=s.substring(i+k,i+2*k);
            else
             r+=s.substring(i+k,n);
            // temp.append(s.substring(i,i+2*k));
         }
       }
       return r;
    }
}