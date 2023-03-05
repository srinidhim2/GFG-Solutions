//{ Driver Code Starts
import java.io.*;
import java.util.*;

class RodCutting {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            Solution ob = new Solution();
            System.out.println(ob.cutRod(arr, n));
        }
    }
}

// } Driver Code Ends


class Solution{
    
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here
        int dp[][] = new int[n+1][W+1];
        for(int i=0;i<n;i++)
            for(int j=0;j<W+1;j++)
                if(i==0 || j==0)
                    dp[i][j]=0;
        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                if(wt[i-1]<=j)

               dp[i][j]=Math.max(val[i-1]+dp[i][j-wt[i-1]] , dp[i-1][j]);//replace dp[i-1] with dp[i] in take part

               else dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][W];
    } 
    public int cutRod(int price[], int n) {
        //code here
        int[] val=new int[n];
        for(int i=0;i<n;i++){
            val[i]=i+1;
        }
        return knapSack(n,val,price,n);
    }
}
