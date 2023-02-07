
class Solution
{
    static int majorityElement(int arr[], int size)
    {
        // your code here
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<size;i++){
            if(mp.containsKey(arr[i]))
                mp.put(arr[i],mp.get(arr[i])+1);
            else
                mp.put(arr[i],1);
        }
        int max=0,ans=-1;
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            if(entry.getValue()>max && entry.getValue()>size/2)
                {   
                    max=entry.getValue();
                   
                        ans=entry.getKey();
                }
        }
        int count=0;
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            if(entry.getValue()==max)
                count++;
        }
        if(count>1)
            ans=-1;
        return ans;
    }
}
