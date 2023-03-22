
class Solution {
    static void dfs(int node,ArrayList<ArrayList<Integer>> adjLs,int[] vis){
        vis[node]=1;
        for(int it:adjLs.get(node)){
            if(vis[it]==0){
                dfs(it,adjLs,vis);
            }
        }
    }
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        ArrayList<ArrayList<Integer>> adjLs= new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<V;i++)
            adjLs.add(new ArrayList<Integer>());
        
        for(int i=0;i<V;i++)
            for(int j=0;j<V;j++){
                if(adj.get(i).get(j)==1 && i!=j){
                    adjLs.get(i).add(j);
                    adjLs.get(j).add(i);
                }
            }
        int vis[] = new int[V];
        int count=0;
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                count++;
                dfs(i,adjLs,vis);
            }
        }
        return count;
    }
};
