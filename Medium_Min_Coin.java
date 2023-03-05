
class Solution
{
    static int mod=1000000000;
    public int MinCoin(int[] nums, int amount)
    {
        // Code here
        int n=nums.length;
        int[][] dp=new int[n][amount+1];
        for(int[] a:dp) Arrays.fill(a,-1);
        int ans=helper(nums,amount,nums.length-1,dp);
        return ans==mod?-1:ans;
    }
    static int helper(int[] coins,int T,int ind,int[][] dp){
        if(ind==0){
            if(T%coins[ind]==0) return T/coins[ind];
            else return mod;
        }
        if(dp[ind][T]!=-1)  return dp[ind][T];
        int notTake=helper(coins,T,ind-1,dp);
        int take=mod;
        if(coins[ind]<=T)
            take=1+helper(coins,T-coins[ind],ind,dp);
        return dp[ind][T]=Math.min(notTake, take);
    }
}
