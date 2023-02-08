//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
	 }
	 
}

// } Driver Code Ends


class Solution{

    static int minJumps(int[] arr){
        // int index = 0, jump = 0, jcount= 0;
        // while(index < arr.length-1){
        //     jump = arr[index];
        //     if(jump == 0){
        //         return -1;
        //     }
        //     else if(jump >= arr.length-index-1){
        //     return ++jcount;
        //     }
        //     int maxjump = Integer.MAX_VALUE, cur =0, i = 0, jumpindex = index+1;
        //     for(i = index + 1; i <= index +jump; i++){
        //         if(arr[i] == 0)
        //             continue;
        //         cur = arr.length - (arr[i] +1 +i);
        //         if(cur < maxjump){
        //         maxjump = cur;
        //         jumpindex = i;
        //         }
        //     }
        //     index = jumpindex;
        //     jcount++;
        // }
        // return (index > arr.length-1) ? jcount+1 : jcount;
        int n=arr.length;
        if(arr[0] == 0) return -1;

        int steps = arr[0];

        int maxm = arr[0];

        int jump = 1;

        for(int i = 1;i<n;i++){

            if(i == n-1) return jump;

            steps--;

            maxm = Math.max(maxm,(arr[i]+i));

            if(steps == 0){

                jump++;

                if(maxm <= i) return -1;

                steps = maxm - i;

            }

        }

        return -1;
    }
}
