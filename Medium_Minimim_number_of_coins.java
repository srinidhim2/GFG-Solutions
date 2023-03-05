class Solution{
    static List<Integer> minPartition(int N)
    {
        // code hereint n=nums.length;
               List<Integer>a = new ArrayList<>();
               int coins[] = {1,2,5,10,20,50,100,200,500,2000};
               int i=coins.length-1;
               while(i>=0){
                   if(coins[i]>N)  i--;
                   else{
                       a.add(coins[i]);
                       N-=coins[i];
                   }
               }
               return a;
        
    }
   
}
