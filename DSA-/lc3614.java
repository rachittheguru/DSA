class Solution {
    public char processStr(String s, long k) {
        int n = s.length();
        long len = 0;
        for(int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if(c == '*') {
                if(len > 0) len--;
            }else if(c == '#') len <<= 1;
            else if(c != '%') len++;
        }
        if(k >= len) return '.';

        for(int i = n - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if(c == '*') len++;
            else if(c == '%') k = len - 1 - k;
            else if(c == '#') {
                len >>= 1;
                if(k >= len) k -= len;
            }else if(k == --len) return c;
        }
        return '.';
    }
}