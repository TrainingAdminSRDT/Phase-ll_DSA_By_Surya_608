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
