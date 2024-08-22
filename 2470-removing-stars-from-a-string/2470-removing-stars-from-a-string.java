class Solution {
    public String removeStars(String s) {
        char[] ch = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]!='*')
            {
                st.push(ch[i]);
            }
            else
            st.pop();
        }
        String ss = "";
        for(int i=0;i<st.size();i++)
        ss+=st.get(i);
        return ss;
    }
}