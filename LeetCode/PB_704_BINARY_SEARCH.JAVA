class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;  
            
            if (nums[mid] == target) {
                return mid;  // target found
            } else if (nums[mid] < target) {
                left = mid + 1;  // search right half
            } else {
                right = mid - 1; // search left half
            }
        }
        
        return -1;  // target not found
    }
    
    // Quick test
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {-1,0,3,5,9,12};
        
        System.out.println(sol.search(nums, 9));  // Output: 4
        System.out.println(sol.search(nums, 2));  // Output: -1
    }
}
