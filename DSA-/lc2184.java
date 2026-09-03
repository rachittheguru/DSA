class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long low = 1;
        long minTime = Integer.MAX_VALUE;
        for (int t : time) {
            minTime = Math.min(minTime, t);
        }
        // the maximum time needed to complete all trips is when we use the 
        long high = minTime * (long) totalTrips;
        while (low < high) {
            long mid = low + (high - low) / 2;
            long trips = 0;
            for (int t : time) {
                trips += mid / t;
                if (trips >= totalTrips) {
                    break;
                }
            }
            if (trips >= totalTrips) {
                high = mid;
            } 
            else {
                low = mid + 1;
            }
        }
        return low;
    }
}