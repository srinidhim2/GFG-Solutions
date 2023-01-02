class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        Arrays.sort(arr);
        return arr[k-1];
        // ArrayList<Integer> a = new ArrayList<>();
        // for(int i=l;i<=r;i++){
        //     if(a.contains(arr[i])==false)
        //         a.add(arr[i]);
        // }
        // return a.get(k-1);
    } 
}
