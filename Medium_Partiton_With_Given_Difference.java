//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]) throws IOException{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int d=sc.nextInt();
            
            int []arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            
            Solution obj=new Solution();
            int res=obj.countPartitions(n, d, arr);
            System.out.println(res);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//Back-end complete function Template for Java

class Solution{
    int f(int ind,int sum,int[] arr, int[][] dp){
        if(ind==0){
            if(sum==0 && arr[0]==0) return 2;
            if(sum==0 || sum==arr[0])   return 1;
            return 0;
        }
        if(dp[ind][sum]!=-1)    return dp[ind][sum];
        int notTake=f(ind-1,sum,arr,dp);
        int take=0;
        if(sum>=arr[ind])
            take=f(ind-1,sum-arr[ind],arr,dp);
        return dp[ind][sum]=(take+notTake)%1000000007;
    }
    int findWays(int[] arr,int tar){
        int n=arr.length;
        int[][]dp = new int[n][tar+1];
        for(int[] a:dp) 
            Arrays.fill(a,-1);
        return f(n-1,tar,arr,dp);
    }
    public int countPartitions(int n, int d, int arr[]){
        // Code here
        int tot=0;
        for(int a:arr) tot+=a;
        if(tot-d<0 || (tot-d)%2!=0)  return 0;
        return findWays(arr,(tot-d)/2);
    }
}
