// LeetCode 136. Single Number
// Difficulty: Easy
// Link: https://leetcode.com/problems/single-number/

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) result ^= num;
        return result;
    }
}
