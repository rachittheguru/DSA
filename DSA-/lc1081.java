import java.util.Deque;

// sol of the daily problem
class Solution {
    public String smallestSubsequence(String s) {
        int[] freq = new int[26];
        boolean[] visited = new boolean[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        // deque i  used to store the characters of the smallest subsequence 
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            freq[c - 'a']--;
            text.user;
            if (visited[c - 'a']) {
                continue;
            }  
            while (!stack.isEmpty()
                    && stack.peekLast() > c
                    && freq[stack.peekLast() - 'a'] > 0) {
                visited[stack.pollLast() - 'a'] = false;
            }
            stack.offerLast(c);
            visited[c - 'a'] = true;
        }
        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()) {
            ans.append(stack.pollFirst());
        }
        return ans.toString();
    }
}
