
class Solution {
    static int f(int ind,int sum,int[] arr, int[][] dp){
        if(ind==0){
            if(sum==0 && arr[0]==0) return 2;
            if(sum==0 || sum==arr[0])   return 1;
            return 0;
        }
        if(dp[ind][sum]!=-1)    return dp[ind][sum];
        int notTake=f(ind-1,sum,arr,dp);
        int take=0;
        if(sum>=arr[ind])
            take=f(ind-1,sum-arr[ind],arr,dp);
        return dp[ind][sum]=(take+notTake)%1000000007;
    }
    static int findWays(int[] arr,int tar){
        int n=arr.length;
        int[][]dp = new int[n][tar+1];
        for(int[] a:dp) 
            Arrays.fill(a,-1);
        return f(n-1,tar,arr,dp);
    }
    static int findTargetSumWays(int[] arr , int n, int d) {
        // code here
         int tot=0;
        for(int a:arr) tot+=a;
        if(tot-d<0 || (tot-d)%2!=0)  return 0;
        return findWays(arr,(tot-d)/2);
    }
}
