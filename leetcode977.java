// LeetCode 977. Squares of a Sorted Array
// Difficulty: Easy
// Link: https://leetcode.com/problems/squares-of-a-sorted-array/

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0, right = n - 1, pos = n - 1;
        while (left <= right) {
            int lSq = nums[left] * nums[left];
            int rSq = nums[right] * nums[right];
            if (lSq > rSq) {
                result[pos--] = lSq;
                left++;
            } else {
                result[pos--] = rSq;
                right--;
            }
        }
        return result;
    }
}
