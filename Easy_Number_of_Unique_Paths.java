
class Solution
{
    public static int ways(int i,int j,int[][] dp){
        if(i==0 && j==0)
            return 1;
        if(i<0 || j<0)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int up=ways(i-1,j,dp);
        int left=ways(i,j-1,dp);
        return dp[i][j]=up+left;
        
            
    }
    //Function to find total number of unique paths.
    public static int NumberOfPath(int a, int b) 
    {
        //Your code here
        int[][] dp = new int[a][b];
        for(int i=0;i<a;i++)
            Arrays.fill(dp[i],-1);
        return ways(a-1,b-1,dp);
    }
}
