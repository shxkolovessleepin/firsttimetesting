public class Solution {
    public long fibonacci(int n) {
        if (n == 0 || n == 1) return n;
        else if (n < 0) return -1;
        else {
            long a = 0;
            long b = 1;
            long t = 0;
            for (int i = 2; i <= n; i++) {
                if (Long.MAX_VALUE - b < a) return Long.MAX_VALUE;
                t = a + b;
                a = b;
                b = t;
            }
            return t;
        }
    }
}
