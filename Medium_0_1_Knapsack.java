

class Solution 
{ 
    
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here
        int dp[][] = new int[n+1][W+1];
        for(int i=0;i<n;i++)
            for(int j=0;j<W+1;j++)
                if(i==0 || j==0)
                    dp[i][j]=0;
        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                
                int notTake=dp[i-1][j];
                int take=Integer.MIN_VALUE;
                if(wt[i-1]<=j)
                {take=val[i-1]+dp[i-1][j-wt[i-1]];
                dp[i][j]=Math.max(take , notTake);
                }
               else dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][W];
    } 
}
