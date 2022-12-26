class Solution{

    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long curr=arr[0],glo=arr[0];
		for(int i=1;i<arr.length;i++){
		    curr=Math.max(arr[i],curr+arr[i]);
		    if(glo<curr)
		        glo=curr;
		}
        return glo;
    }
    
}

