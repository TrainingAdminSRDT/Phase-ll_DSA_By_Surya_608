class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];
        
        // Initialize all with -1
        for (int i = 0; i < n; i++) {
            ans[i] = -1;
        }
        
        // If window size is larger than array, return ans directly
        if (k == 0) return nums;
        if (2 * k + 1 > n) return ans;
        
        long sum = 0;
        
        // First window sum
        for (int i = 0; i < 2 * k + 1; i++) {
            sum += nums[i];
        }
        ans[k] = (int)(sum / (2 * k + 1));
        
        // Sliding window
        for (int i = 2 * k + 1; i < n; i++) {
            sum += nums[i];              // add new element
            sum -= nums[i - (2 * k + 1)]; // remove old element
            ans[i - k] = (int)(sum / (2 * k + 1));
        }
        
        return ans;
    }
}
