class Solution {
    public int maximumLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int ans = 1;

        // Special case for 1
        if (map.containsKey(1)) {
            int count = map.get(1);
            ans = (count % 2 == 0) ? count - 1 : count;
        }

        for (int num : map.keySet()) {

            if (num == 1) continue;

            int len = 0;
            long curr = num;

            while (map.containsKey((int) curr) && map.get((int) curr) >= 2) {
                len++;
                curr = curr * curr;
            }

            // add the middle element
            if (map.containsKey((int) curr)) {
                len++;
            }

            ans = Math.max(ans, len * 2 - 1);
        }

        return ans;
    }
}