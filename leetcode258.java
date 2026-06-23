// LeetCode 258. Add Digits
// Difficulty: Easy
// Link: https://leetcode.com/problems/add-digits/

class Solution {
    public int addDigits(int num) {
        if (num == 0) return 0;
        return 1 + (num - 1) % 9;
    }
}
