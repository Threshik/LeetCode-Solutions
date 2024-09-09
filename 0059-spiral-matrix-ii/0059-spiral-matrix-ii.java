class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int left=0;
        int right=n-1;
        int top=0,k=1;
        int bottom=n-1;
        while(left<=right && top<=bottom)
        {
                for(int i=left;i<=right;i++)
                {
                    matrix[top][i]=k;
                    k++;
                }
                top++;
                for(int i=top;i<=bottom;i++)
                {
                    matrix[i][right]=k;
                    k++;
                }
                right--;
                if(top<=bottom)
                {
                    for(int i=right;i>=left;i--)
                    {
                        matrix[bottom][i]=k;
                        k++;
                    }
                    bottom--;
                }
                if(left<=right)
                {
                    for(int i=bottom;i>=top;i--)
                    {
                        matrix[i][left]=k;
                        k++;
                    }
                    left++;
                }
            
            
        }
        return matrix;
    }
}