class Solution{
    public int minimumEnergy(int arr[],int N){
        //code here
        int [] dp = new int[N];
        dp[0]= 0;
        dp[1] = Math.abs(arr[0]-arr[1]);
        for(int i =2;i<N;i++){
            int left = Math.abs(arr[i]-arr[i-1])+dp[i-1];
            int right = Math.abs(arr[i]-arr[i-2])+dp[i-2];
            dp[i] = Math.min(left,right);
        }
        return dp[N-1];
    }
}
