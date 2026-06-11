class Solution {
    
    int[] h;
    static int mod = 1000000007;

    public void dfs(int node,List<List<Integer>> ls,int par,int[] h,int hh){
        h[node] = hh;
        for(int i : ls.get(node)){
            if(i != par){
                dfs(i,ls,node,h,hh+1);
            }
        }
    }
    
    private int modPow(long base, int exp) {
        long res = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) res = (res * base) % mod;
            base = (base * base) % mod;
            exp >>= 1;
        }
        return (int) res;
    }
    
    public int assignEdgeWeights(int[][] edges) {
        List<List<Integer>> ls = new ArrayList<>();
        int n = edges.length;
        n++;
        h = new int[n+1];
        for(int i=0;i<=n;i++){
            ls.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            ls.get(u).add(v);
            ls.get(v).add(u);
        }
        dfs(1,ls,-1,h,0);
        int maxi = -1;
        for(int i=1;i<=n;i++){
            maxi = Math.max(maxi,h[i]);
        }
        return modPow(2, maxi - 1);
    }
}