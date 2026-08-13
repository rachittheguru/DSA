
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int asum = n*(n+1)/2;
        int bsum =0;
        for(int num:nums){
            bsum+=num;
        }
        return asum-bsum;
        
    }
}