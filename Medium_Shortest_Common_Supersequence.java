
class Solution
{
    //Function to find length of shortest common supersequence of two strings.
     public static int lscTab(String s1,String s2,int[][] dp){
        int n=s1.length();
        int m=s2.length();
        for(int i=0;i<=n;i++) dp[i][0]=0;
        for(int j=0;j<=m;j++) dp[0][j]=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                Character c1=s1.charAt(i-1);
                Character c2=s2.charAt(j-1);
            if(c1.equals(c2)){
               
                dp[i][j]=1+dp[i-1][j-1];
            }
            else
                dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[n][m];

    }
    public static int shortestCommonSupersequence(String X,String Y,int m,int n)
    {
        //Your code here
        int[][] dp1=new int[X.length()+1][Y.length()+1];
        return n+m-lscTab(X,Y,dp1);
    }
}
