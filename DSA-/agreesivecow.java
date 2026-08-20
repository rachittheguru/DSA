class Solution {
    public int aggressiveCows(int[] arr, int k) {
        Arrays.sort(arr);
        int  low =1;
        int high = arr[arr.length - 1] - arr[0];
        int ans =0;
        
        while(low<=high){
            int mid = low+(high-low)/2;
            
            while(true){
                int dis = Array.max(high,low)
            }
            if(ispossible(arr,k,mid)){
                ans=mid;
                low=mid+1;
                
            }else{
                high=mid-1;
            }
            
        }
        return ans;
        
    }
    private boolean ispossible(int[] arr , int k , int distance ){
        int cows=1;
        int lastpos=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]-lastpos>=distance){
                cows++;
                lastpos=arr[i];
            }
            if(cows >=k){
                return true;
            }
            }
        
        return false;
    }
}