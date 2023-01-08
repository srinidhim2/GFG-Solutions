
class Solution
{
    public int firstElementKTime(int[] a, int n, int k) { 
       if(n==1){
           if(k==1)
            return a[0];
        return -1;
       } 
       Map<Integer,Integer> map= new HashMap<>();
       for(int i=0;i<n;i++){
           map.put(a[i],map.getOrDefault(a[i],0)+1);
           if(map.get(a[i])>=k)
            return a[i];
       }
       return -1;
    } 
}
