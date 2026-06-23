// LeetCode 2090. K Radius Subarray Averages
// Difficulty: Medium
// Link: https://leetcode.com/problems/k-radius-subarray-averages/

import java.util.Arrays;

class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        if (2 * k + 1 > n) return result;
        long windowSum = 0;
        int windowSize = 2 * k + 1;
        for (int i = 0; i < windowSize; i++) windowSum += nums[i];
        result[k] = (int)(windowSum / windowSize);
        for (int i = k + 1; i < n - k; i++) {
            windowSum += nums[i + k];
            windowSum -= nums[i - k - 1];
            result[i] = (int)(windowSum / windowSize);
        }
        return result;
    }
}
