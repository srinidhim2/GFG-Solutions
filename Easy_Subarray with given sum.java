class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> a = new ArrayList<>();
        // Your code here
        int sum=0,start=0;
        for(int i=0;i<n;i++){
            if(s==0)
                break;
            sum+=arr[i];
            while(sum>s){
                sum=sum-arr[start];
                start++;
            }
            if(sum==s){
                a.add(start+1);
                a.add(i+1);
                return a;
            }
            
        }
        a.add(-1);
        return a;
    }
}
