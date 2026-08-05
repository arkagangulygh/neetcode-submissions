//import java.util.*;

class Solution {
    public int coinChange(int[] coins, int amount) {

        int n = coins.length;
        int[] dp = new int[amount + 1];

        Arrays.fill(dp, -1);

        int ans = solve(coins, n, amount, dp);

        if (ans >= 1000000000)
            return -1;

        return ans;
    }

    public int solve(int[] coins, int n, int amount, int[] dp) {

        if (amount == 0)
            return 0;

        if (amount < 0)
            return 1000000000;

        if (dp[amount] != -1)
            return dp[amount];

        int ans = 1000000000;

        for (int j = 0; j < n; j++) {
            ans = Math.min(ans, 1 + solve(coins, n, amount - coins[j], dp));
        }

        return dp[amount] = ans;
    }
}