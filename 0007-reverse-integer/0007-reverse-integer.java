import static java.lang.Integer.parseInt;
class Solution {
    public int reverse(int x) {
        int res=0;
        boolean isNegative = x<0;
        String str=Integer.toString(Math.abs(x));
        StringBuilder rev = new StringBuilder(str).reverse();
        try{
          res=Integer.parseInt(rev.toString());
        } catch (NumberFormatException e) {
            return 0;
         }
        return isNegative? -res:res;
    }
   
}