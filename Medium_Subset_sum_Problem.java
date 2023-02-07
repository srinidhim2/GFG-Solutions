class Solution{

    static Boolean isAns(int[] a,int n,int k,int[][] dp){
         if(k==0)   {
              dp[n][k]=1;
              return true;
         }
        if(n==0)  return a[0]==k;
        if(dp[n][k]!=-1){
            if(dp[n][k]==0)
                return false;
            else
                return true;
        }

        boolean not_take=isAns(a,n-1,k,dp);
        boolean take=false;
        if(k>=a[n])
            take=isAns(a,n-1,k-a[n],dp);
        if(take|| not_take)
            dp[n][k]=1;
        else
            dp[n][k]=0;
        return take||not_take;
    }
    static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        int ind=N-1;
        int[][] dp=new int[N][sum+1];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        return isAns(arr,ind,sum,dp);
    }
}
