
class Solution {
    int f(int[] arr,int[] dp,int n){
        if(n==0)
            return arr[n];
        if(n<0)
            return 0;
        if(dp[n]!=-1)
            return dp[n];
        int pick = arr[n]+f(arr,dp,n-2);
        int non_pick=0+f(arr,dp,n-1);
        dp[n]=Math.max(pick,non_pick);
        return dp[n];
    }
    int findMaxSum(int arr[], int n) {
        // code here
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return f(arr,dp,n-1);
        
    }
}
