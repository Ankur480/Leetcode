class Solution {
    
    int[][] dp;
    int[] prefix;

    public int stoneGameV(int[] stoneValue) {
        
        int n = stoneValue.length;
        
        dp = new int[n][n];
        prefix = new int[n + 1];

 
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + stoneValue[i];
        }

        for (int i = 0; i < n; i++) {
            java.util.Arrays.fill(dp[i], -1);
        }

        return solve(stoneValue, 0, n - 1);
    }

    private int solve(int[] a, int left, int right) {

        if (left == right) {
            return 0;
        }
        if (dp[left][right] != -1) {
            return dp[left][right];
        }

        int maxScore = 0;

        for (int k = left; k < right; k++) {

            int leftSum = prefix[k + 1] - prefix[left];
            int rightSum = prefix[right + 1] - prefix[k + 1];

            if (leftSum < rightSum) {

                maxScore = Math.max(
                    maxScore,
                    leftSum + solve(a, left, k)
                );

            } else if (leftSum > rightSum) {

                maxScore = Math.max(
                    maxScore,
                    rightSum + solve(a, k + 1, right)
                );

            } else {

                maxScore = Math.max(
                    maxScore,
                    leftSum + Math.max(
                        solve(a, left, k),
                        solve(a, k + 1, right)
                    )
                );
            }
        }

        return dp[left][right] = maxScore;
    }
}