class Solution {
    static final long MOD = 1_000_000_007L;

    private long[][] multiply(long[][] A, long[][] B) {
        int n = A.length;
        long[][] C = new long[n][n];

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                if (A[i][k] == 0) continue;

                long a = A[i][k];
                for (int j = 0; j < n; j++) {
                    if (B[k][j] == 0) continue;
                    C[i][j] = (C[i][j] + a * B[k][j]) % MOD;
                }
            }
        }
        return C;
    }

    private long[][] power(long[][] base, long exp) {
        int n = base.length;

        long[][] res = new long[n][n];
        for (int i = 0; i < n; i++) {
            res[i][i] = 1;
        }

        while (exp > 0) {
            if ((exp & 1) == 1) {
                res = multiply(res, base);
            }
            base = multiply(base, base);
            exp >>= 1;
        }

        return res;
    }

    public int zigZagArrays(int n, int l, int r) {
        int m = r - l + 1;
        int sz = 2 * m;

        long[][] T = new long[sz][sz];

        // up[x] -> down[y] where y > x
        for (int x = 0; x < m; x++) {
            for (int y = x + 1; y < m; y++) {
                T[x][m + y] = 1;
            }
        }

        // down[x] -> up[y] where y < x
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < x; y++) {
                T[m + x][y] = 1;
            }
        }

        long[][] P = power(T, n - 1);

        long[] init = new long[sz];
        for (int i = 0; i < sz; i++) {
            init[i] = 1;
        }

        long ans = 0;

        for (int j = 0; j < sz; j++) {
            long ways = 0;

            for (int i = 0; i < sz; i++) {
                ways = (ways + init[i] * P[i][j]) % MOD;
            }

            ans = (ans + ways) % MOD;
        }

        return (int) ans;
    }
}