class Solution {
    public String toLowerCase(String s) {
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            char c = ch[i];
            if(c>='A' && c<='Z')
            {
                char ele = (char)(c-'A'+'a');
                ch[i]=ele;
            }
        }
        String res = String.valueOf(ch);
        return res;
    }
}