public class _08_01_WaysToStep {
    public int waysToStep(int n) {
        if(n <= 2){
            return n;
        }
        long MOD = 1000000007;
        long[] dp = new long[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 4; i <= n; i++) {
            dp[i] = (dp[i - 3] % MOD + dp[i - 2] % MOD + dp[i - 1] % MOD) % MOD;
        }
        return (int)dp[n];
    }
}
