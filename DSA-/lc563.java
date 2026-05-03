class Solution {
    int total=0;
    public int findTilt(TreeNode root) {
        dfs(root);
        return total;
    }

    private int dfs(TreeNode root){
        if(root == null) return 0;

        int left =dfs(root.left);
        int right = dfs(root.right);
        total += Math.abs(left-right);

        return left+right+root.val;
    }
}