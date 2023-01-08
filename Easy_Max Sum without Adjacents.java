
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
    
    //===================OR=========================
    int findMaxSum(int arr[], int n) {
        int prev=arr[0];
        int prev2=0;
        for(int i=1;i<n;i++){
            int pick=arr[i];
            if(i>1)
                pick+=prev2;
            int non_pick=0+prev;
            int curr=Math.max(pick,non_pick);
            prev2=prev;
            prev=curr;
            
        }
        return prev;
        
    }
}
