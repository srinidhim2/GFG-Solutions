//{ Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String str = read.readLine();

            Solution ob = new Solution();
            
            System.out.println(ob.countMin(str));
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution{
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
    public static int longestPalinSubseq(String s1)
    {
        //code here
        StringBuffer s2 =new StringBuffer(s1);
        s2.reverse();
        int a=s1.length(),b=s2.length();
        int[][] dp1=new int[a+1][b+1];
        // for(int[] arr:dp1) Arrays.fill(arr,-1);
        return lscTab(s1,s2.toString(),dp1);
    }
    static int countMin(String str)
    {
        // code here
        return str.length()-longestPalinSubseq(str);
    }
}
