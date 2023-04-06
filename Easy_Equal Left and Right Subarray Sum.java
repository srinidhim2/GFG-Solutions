class Solution{
	int equalSum(int [] A, int N) {
		//Write your code here
		
		int sum=0;
        for(int i=0; i<N; i++){
            sum+=A[i];
        }
        int leftsum=0;
        for(int i=0; i<N; i++){
            leftsum+=A[i];
            if(leftsum-A[i]==sum-leftsum){
                return i+1;
            }
        }
        return -1;
	}
}
