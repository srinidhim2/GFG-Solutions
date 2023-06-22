class Solution {
    static boolean lemonadeChange(int N, int bills[]) {
        // code here
        int five=0,ten=0;
        for(int i=0;i<N;i++){
            if(bills[i]==20){
                if(ten>0 && five>0){
                    ten--;
                    five--;
                }
                else if(five>=3){
                    five-=3;
                }
                else return false;
            }
            else if(bills[i]==10){
                ten++;
                if(five>0) five--;
                else return false;
            }
            else five++;
        }
        return true;
    }
}
