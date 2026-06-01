class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int ans =0;
        int n=cost.length;

        for (int i = n - 1, count = 1; i >= 0; i--, count++){
            if (count % 3 != 0){
                ans+= cost[i];
            }
        }
        return ans;
        
    }
}