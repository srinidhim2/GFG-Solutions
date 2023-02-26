//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int sum = sc.nextInt();
                    int arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                    arr[i] = sc.nextInt();
                    
                    Solution ob = new Solution();
                    System.out.println(ob.perfectSum(arr,n,sum));
                }
        }
}    
// } Driver Code Ends


class Solution{
public int perfectSum(int arr[],int n, int sum) 

 { 
    int[]prev = new int[sum+1];
    int countZero = 0;
    for(int a:arr) countZero+=a==0?1:0;
    prev[0] = 1;
    if(arr[0]!=0 && arr[0]<=sum){
      prev[arr[0]] = 1;
    }
    for(int i=1;i<n;i++){
      int[]curr = new int[sum+1];
      curr[0] = 1;
      for(int j=1;j<=sum;j++){
          if(arr[i]==0){
              curr[j] = prev[j];
              continue;
          }
          int notTake = prev[j];
          int take = 0;
          if(arr[i]<=j)
            take = prev[j-arr[i]];
            curr[j] = (notTake + take)%1000000007;
      }
             prev = curr;
            
      
    }
  return ((prev[sum]%1000000007) * (int) Math.pow(2,countZero) ) % 1000000007;
 } 
}
