
class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
        int low=0,high=n-1,mid=(low+high)/2;
        while(low<high){
            if(k<arr[mid]){
                high=mid-1;
                mid=(low+high)/2;
            }
            if(k>arr[mid]){
                low=mid+1;
                mid=(low+high)/2;
            }
            if(k==arr[mid])
                return mid;
        }
        return -1;
    }
}
