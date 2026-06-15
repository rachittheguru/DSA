class Solution {
    public int pairSum(ListNode head) {
        List<Integer> nums = new ArrayList<>();

        while (head != null) {
            nums.add(head.val);
            head = head.next;
        }

        int ans = 0;
        int i = 0, j = nums.size() - 1;

        while (i < j) {
            ans = Math.max(ans, nums.get(i) + nums.get(j));
            i++;
            j--;
        }

        return ans;
    }
}

