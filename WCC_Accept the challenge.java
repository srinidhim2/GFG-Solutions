// Add x to your current score and double the value of x.







//User function Template for Java

class Solution{
    int flag=0;
    public long acceptTheChallenge(int k){
        // Solve Here
        int ind=0;
        for(int i=1;i<=k/2;i++)
        {    ans(k,0,i);
        if(flag==1){ ind=i;flag=0;}
        }
        if(ind!=0) return ind;
        return -1;
    }
    public void ans(int k,int score,int x){
        if(score==k)    flag=1;
        if(score>k) return;
        
        
        ans(k,score+x,2*x);
    }
}
