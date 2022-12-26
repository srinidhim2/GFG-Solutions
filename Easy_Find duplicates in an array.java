
class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        int flag=0;
        int count =0;
        ArrayList<Integer> a = new ArrayList<>();
        Set<Integer> b= new HashSet<Integer>();
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1] && count!=1){
                a.add(arr[i]);
                count++;
            }
            else if(arr[i]!=arr[i+1])
                count=0;
        }
        if(a.size()==0)
            a.add(-1);
        return a;
    }
}
