class Solution
{
    //Function to count number of ways to reach the nth stair.
    int mod=1000000007;
    
    int countWays(int n)
    {
        int prev=1,prev2=1;
        for(int i=2;i<=n;i++){
            int curr=(prev+prev2)%mod;
            prev=prev2;
            prev2=curr;
        }
        return prev2;
    }
    
}

