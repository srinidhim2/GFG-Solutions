class Solution {
    public int DS(String s1,String s2,int i,int j,int[][] dp){
        if(j<0) return 1;
        if(i<0) return 0;
        if(dp[i][j]!=-1)    return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j))
            return dp[i][j]=DS(s1, s2, i-1, j-1,dp)+DS(s1, s2, i-1, j,dp);
        else    
            return dp[i][j]=DS(s1, s2, i-1, j,dp);
    }
    public int numDistinct(String s1, String s2) {
        int i=s1.length(),j=s2.length();
        int[][] dp = new int[i][j];
        for(int[] a:dp) Arrays.fill(a,-1);   
        return DS(s1,s2,i-1,j-1,dp);
    }
}
