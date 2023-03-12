import java.util.*;
public class Solution {
	public static int wild(int i,int j,String s1,String s2,int[][] dp){
        if(j<0 && i<0)
            return 1;
        if(i<0 && j>=0) return 0;
        if(j<0 && i>=0){
            for(int a=0;a<=i;a++)
                if(s1.charAt(a)!='*')
                    return 0;
            return 1;
        }
        if(dp[i][j]!=-1)    return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j) || s1.charAt(i)=='?'){ 
            return wild(i-1, j-1, s1, s2,dp);
        }
        if(s1.charAt(i)=='*')   return wild(i-1, j, s1, s2,dp)==1 || wild(i, j-1, s1, s2,dp)==1 ?1:0;
        return 0;
    }
	public static boolean wildcardMatching(String s1, String s2) {
		// Write your code here.
		int a=s1.length(),b=s2.length();
        int[][] dp=new int[a][b];

        for(int[] i:dp) Arrays.fill(i,-1);

        return wild(a-1, b-1, s1, s2,dp)==1?true:false;
	}
}
