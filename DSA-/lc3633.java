class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int ans = Integer.MAX_VALUE;
        for(int i =0;i<landStartTime.length;i++){
            for(int j =0;j<waterStartTime.length;j++){
                int a = landStartTime[i]+landDuration[i];
                int b = Math.max(a,waterStartTime[j])+waterDuration[j];

                int c=waterStartTime[j]+waterDuration[j];
                int d =Math.max(c,landStartTime[i])+landDuration[i];
                ans = Math.min(ans,Math.min(b,d));

            }
        }
        return ans;
        
    }
}