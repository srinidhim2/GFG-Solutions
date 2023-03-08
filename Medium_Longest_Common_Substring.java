//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input[] = read.readLine().trim().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            
            String S1 = read.readLine().trim();
            String S2 = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestCommonSubstr(S1, S2, n, m));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int lscTab(String s1, String s2, int[][] dp) {
        int n = s1.length();
        int m = s2.length();
        for (int i = 0; i <= n; i++)
            dp[i][0] = 0;
        for (int j = 0; j <= m; j++)
            dp[0][j] = 0;
        int ans=0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                Character c1 = s1.charAt(i - 1);
                Character c2 = s2.charAt(j - 1);
                if (c1.equals(c2)) {

                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    ans=Math.max(ans,dp[i][j]);
                } else
                    dp[i][j] = 0;
            }
        }
        return ans;

    }
    int longestCommonSubstr(String s1, String s2, int n, int m){
        // code here
        int[][] dp=new int[s1.length()+1][s2.length()+1];
        return lscTab(s1,s2,dp);
        
    }
}
