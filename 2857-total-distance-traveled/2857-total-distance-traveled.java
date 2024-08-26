class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int res=0;
        int j=1;
       for(int i=mainTank;i>0;i--)
       {
        if(additionalTank>0 && j==5)
        {
            i+=1;
            j=0;
            additionalTank--;
        }
        j++;
        res+=10;
       }
       return res;
        
    }
}