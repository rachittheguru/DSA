class Solution {
    public static int trap(int[] height) {
        Stack<Integer> stack=new Stack<>();
        int water =0;
        for(int i=0;i<height.length;i++){
            while(!stack.isEmpty() && height[i] > height[stack.peek()]){
                int bottom = stack.pop();
                if(stack.isEmpty())
                    break;
                int left=stack.peek();
                int dis=i-left-1;
                int a =Math.min(height[left],height[i])-height[bottom];
                water+=dis*a;

            }
            stack.push(i);
        }
        return water;
    }
}