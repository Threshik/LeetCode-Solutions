class Solution {
    public boolean isAnagram(String s, String t) {
        int len1 = s.length();
        int len2 = t.length(); 
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        if(len1==len2)
        {
        Arrays.sort(c1);
        Arrays.sort(c2);
        
        }
        return Arrays.equals(c1,c2);
    }
}