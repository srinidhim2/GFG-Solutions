
class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++)
            q.add(arr[i]);
         for(int i=0;i<d;i++)
            q.add(q.poll());
        for(int i=0;i<n;i++)
           arr[i]=q.poll();
    }
}
