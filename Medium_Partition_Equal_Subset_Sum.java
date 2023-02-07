class Solution{
    static int equalPartition(int N, int arr[])
    {
        // code here
        if(Arrays.stream(arr).sum()%2!=0)
            return 0;
        else
            if(isSubsetSum(N-1,arr,Arrays.stream(arr).sum()/2))
                return 1;
            else return 0;
    }
    static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        int ind=N-1;
        int[][] dp=new int[N][sum+1];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        return isEq(arr,ind,sum,dp);
    }
    static Boolean isEq(int[] a,int n,int k,int[][] dp){
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

       boolean not_take=isEq(a,n-1,k,dp);
       boolean take=false;
       if(k>=a[n])
           take=isEq(a,n-1,k-a[n],dp);
       if(take|| not_take)
           dp[n][k]=1;
       else
           dp[n][k]=0;
       return take||not_take;
   }
}
