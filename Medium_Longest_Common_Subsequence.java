//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {

		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-- > 0){
		    int p=sc.nextInt();             // Take size of both the strings as input
		    int q=sc.nextInt();
		    
		    String s1=sc.next();            // Take both the string as input
	        String s2=sc.next();
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.lcs(p, q, s1, s2));
		}
	}
}
// } Driver Code Ends


class Solution
{
     static int f(String s1,String s2,int ind1,int ind2,int[][] dp){
        if(ind1<0 || ind2<0)
            return 0;
        if(dp[ind1][ind2]!=-1)  return dp[ind1][ind2];
        Character c1=s1.charAt(ind1);
        Character c2=s2.charAt(ind2);
        if(c1.equals(c2))
            return 1+f(s1, s2, ind1-1, ind2-1,dp);
        return dp[ind1][ind2]= Math.max(f(s1, s2, ind1-1, ind2,dp),f(s1, s2, ind1, ind2-1,dp));

    }
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int x, int y, String s1, String s2)
    {
        // your code here
        int[][] dp=new int[x][y];
        for(int[] a:dp) Arrays.fill(a,-1);
        return f(s1,s2,x-1,y-1,dp);
    }
    
}
