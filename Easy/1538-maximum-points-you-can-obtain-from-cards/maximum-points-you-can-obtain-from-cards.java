class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;

        // if (k == 0) return 0;

        // // Edge case: pick all cards
        // if (k == n) {
        //     int total = 0;
        //     for (int x : cardPoints) total += x;
        //     return total;
        // }

        // Initial sum: take first k cards from left
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += cardPoints[i];
        }

        int maxSum = currentSum;

        // Slide: remove from left, add from right
        int rightIndex = n - 1;
        for (int i = k - 1; i >= 0; i--) {
            currentSum -= cardPoints[i];
            currentSum += cardPoints[rightIndex--];
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
