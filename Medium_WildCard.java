//{ Driver Code Starts
import java.util.*;

class WildcardPattern
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String pat = sc.nextLine();
			String text = sc.nextLine();
			Solution g = new Solution();
			System.out.println(g.wildCard(pat,text));
			t--;
		}
	}
}
// } Driver Code Ends


class Solution
{   public static int wild(int i,int j,String s1,String s2,int[][] dp){
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
            return dp[i][j]=wild(i-1, j-1, s1, s2,dp);
        }
        if(s1.charAt(i)=='*'){   
            if(wild(i-1, j, s1, s2,dp)==1 || wild(i, j-1, s1, s2,dp)==1 )
            {
                dp[i][j]=1;
                
            
            }
            else dp[i][j]=0;
            return wild(i-1, j, s1, s2,dp)==1 || wild(i, j-1, s1, s2,dp)==1 ?1:0;
        
            
        }
        return dp[i][j]=0;
    }
    int wildCard(String s1, String s2)
    {
        // Your code goes here
        int a=s1.length(),b=s2.length();
        int[][] dp=new int[a][b];

        for(int[] i:dp) Arrays.fill(i,-1);

        return wild(a-1, b-1, s1, s2,dp);
    }
}
