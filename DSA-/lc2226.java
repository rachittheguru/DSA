class Solution {
    public int maximumCandies(int[] candies, long k) {
        int low =0;
        int high =0;
        for(int candy : candies){
            high = Math.max(high,candy);

        }
        while(low<high){
            int mid = low + (high - low + 1) / 2;
            long a =0;
            for(int candy :candies){
                a+=candy/mid;
                if(a>=k){
                    break;
                }
            }
            if(a>=k){
                low=mid;
            }
            else{
                high = mid-1;
            }
        }
        return low;



        
    }
}