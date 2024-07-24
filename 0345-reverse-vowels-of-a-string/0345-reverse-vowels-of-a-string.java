class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        char[] ch = s.toCharArray();
        int left=0;
        int right=n-1;
        while(left<right)
        {
            while(left<right && ch[left]!='a' && ch[left]!='e' && ch[left]!='i' && ch[left]!='o' && ch[left]!='u' && ch[left]!='A' && ch[left]!='E' && ch[left]!='I' && ch[left]!='O' && ch[left]!='U')
            left++;
            while(left<right && ch[right]!='a' && ch[right]!='e' && ch[right]!='i' && ch[right]!='o' && ch[right]!='u' && ch[right]!='A' && ch[right]!='E' && ch[right]!='I' && ch[right]!='O' && ch[right]!='U')
            right--;
            if(left>=right)
            break;
            
            //swapping logic
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;

            left++;
            right--;
        }
        String res = String.valueOf(ch);
        return res;
    }
}