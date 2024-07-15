class Solution {
    public int dfs(int row,int col, int[][] grid,int[] dx,int[] dy)
    {
        int n = grid.length;
        int m = grid[0].length;
        if(row<0 || row>=n || col<0 || col>=m || grid[row][col]!=1)
        return 0;
        grid[row][col]=2;
        int ans=0;
        for(int i=0;i<4;i++)
        {
            int n1 = row+dx[i];
            int n2 = col+dy[i];
            ans+=dfs(n1,n2,grid,dx,dy);
        }
        return ans+1;
    }
    public int maxAreaOfIsland(int[][] grid) {
        if(grid==null || grid.length==0)
        return 0;
        int n = grid.length;
        int m = grid[0].length;
        int[] dx = {0,0,1,-1};
        int[] dy = {1,-1,0,0};
        int max = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                    int count=dfs(i,j,grid,dx,dy);
                    if(count>max)
                    max=count;
                }
            }
        }
        return max;

    }
}