class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }

    private TreeNode build(int[] nums, int left, int right) {
        if (left > right) return null;

        int maxi = left;

        for (int i = left; i <= right; i++) {
            if (nums[i] > nums[maxi]) {
                maxi = i;
            }
        }

        TreeNode root = new TreeNode(nums[maxi]);

        root.left = build(nums, left, maxi - 1);
        root.right = build(nums, maxi + 1, right);

        return root;
    }
}