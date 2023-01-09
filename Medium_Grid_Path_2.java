
class Solution {
    int mod = 1000000007;
    public int totalWays(int N, int M, int grid[][]) {
        // Code here
       int [][]dp = new int[N][M];
       
        for(int i=0;i<N;i++){
            for(int j =0;j<M;j++){
                if(i>=0 && j>=0 && grid[i][j]==1)dp[i][j]=0;
                else if(i==0 && j==0)dp[i][j]=1;
                else{
                    int up =0,left =0;
                    if(i>0)up = dp[i-1][j]%mod;
                    if(j>0)left = dp[i][j-1]%mod;
                    dp[i][j]= (up+left)%mod;
                }
            }
        }
        return dp[N-1][M-1];
    }
}
