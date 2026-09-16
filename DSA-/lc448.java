Class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums){
        Set<Intger> set = new HashSet<>();
        for(int num:nums){
         set.add(num);
        }
        List<Integer>ans = new LinkedList<>();
        for(int i =1;i<nums.length;i++){
            if(set.contains(i)){
                ans.add(i);

            }
        }
        return ans;

        

    }
    
}