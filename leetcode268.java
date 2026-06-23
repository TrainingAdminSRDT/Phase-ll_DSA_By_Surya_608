// LeetCode 268. Missing Number
// Difficulty: Easy
// Link: https://leetcode.com/problems/missing-number/

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) actualSum += num;
        return expectedSum - actualSum;
    }
}
