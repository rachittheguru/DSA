
import java.util.HashMap;
import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack= new Stack<>();
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int nums:nums2){
            while(!stack.isEmpty()&& nums>stack.peek()){
            map.put(stack.pop(),nums);



        }
        stack.push(num);
        }
        int [] ans = new int[nums1.length];
        for(int i =0;i<nums1.length;i++){
            ans[i]=map.getOrDefault(nums1[i], i);

        }
        return ans;
        
    }
}