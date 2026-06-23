import java.util.*;
import java.lang.Math;

/* =========================================================
   2235. Add Two Integers
========================================================= */
class AddTwoIntegers {
    public int sum(int num1, int num2) {
        return num1 + num2;
    }
}

/* =========================================================
   7. Reverse Integer
========================================================= */
class ReverseInteger {
    public int reverse(int x) {
        long n = x;

        if (n < 0) n = -n;

        String s = Long.toString(n);
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        long k = Long.parseLong(sb.toString());

        if (x < 0) k = -k;

        if (k < Integer.MIN_VALUE || k > Integer.MAX_VALUE) return 0;

        return (int) k;
    }
}

/* =========================================================
   136. Single Number
========================================================= */
class SingleNumber {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int num : nums) ans ^= num;
        return ans;
    }
}

/* =========================================================
   169. Majority Element
========================================================= */
class MajorityElement {
    public int majorityElement(int[] nums) {
        int cnt = 0;
        int m = 0;

        for (int x : nums) {
            if (cnt == 0) {
                m = x;
                cnt = 1;
            } else {
                cnt += (m == x) ? 1 : -1;
            }
        }
        return m;
    }
}

/* =========================================================
   26. Remove Duplicates from Sorted Array
========================================================= */
class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                nums[++i] = nums[j];
            }
        }
        return i + 1;
    }
}

/* =========================================================
   1480. Running Sum of 1d Array
========================================================= */
class RunningSum {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}

/* =========================================================
   53. Maximum Subarray (Kadane's Algorithm)
========================================================= */
class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int curr = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            curr = Math.max(nums[i], curr + nums[i]);
            max = Math.max(max, curr);
        }
        return max;
    }
}

/* =========================================================
   1. Two Sum (correct version)
========================================================= */
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}

/* =========================================================
   283. Move Zeroes
========================================================= */
class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k++] = temp;
            }
        }
    }
}

/* =========================================================
   643. Maximum Average Subarray I
========================================================= */
class MaxAverageSubarray {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;

        for (int i = 0; i < k; i++) sum += nums[i];

        double max = sum;

        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            max = Math.max(max, sum);
        }

        return max / k;
    }
}

/* =========================================================
   2090. K Radius Subarray Averages
========================================================= */
class KRadiusAverage {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);

        if (2 * k + 1 > n) return res;

        long sum = 0;

        for (int i = 0; i < 2 * k + 1; i++) {
            sum += nums[i];
        }

        res[k] = (int) (sum / (2 * k + 1));

        for (int i = k + 1; i < n - k; i++) {
            sum += nums[i + k] - nums[i - k - 1];
            res[i] = (int) (sum / (2 * k + 1));
        }

        return res;
    }
}

/* =========================================================
   704. Binary Search
========================================================= */
class BinarySearch {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }
}

/* =========================================================
   35. Search Insert Position
========================================================= */
class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (nums[mid] == target) return mid;

            if (target < nums[mid]) r = mid - 1;
            else l = mid + 1;
        }
        return l;
    }
}

/* =========================================================
   367. Valid Perfect Square
========================================================= */
class PerfectSquare {
    public boolean isPerfectSquare(int num) {
        long l = 1, r = num;

        while (l <= r) {
            long mid = l + (r - l) / 2;
            long sq = mid * mid;

            if (sq == num) return true;
            if (sq < num) l = mid + 1;
            else r = mid - 1;
        }
        return false;
    }
}

/* =========================================================
   342. Power of Four
========================================================= */
class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        for (int i = 0; i <= 15; i++) {
            int val = (int) Math.pow(4, i);
            if (val == n) return true;
            if (val > n) return false;
        }
        return false;
    }
}

/* =========================================================
   242. Valid Anagram
========================================================= */
class Anagram {
    public boolean isAnagram(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}

/* =========================================================
   56. Merge Intervals
========================================================= */
class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> res = new ArrayList<>();

        for (int[] in : intervals) {
            if (res.isEmpty() || res.get(res.size() - 1)[1] < in[0]) {
                res.add(in);
            } else {
                res.get(res.size() - 1)[1] =
                        Math.max(res.get(res.size() - 1)[1], in[1]);
            }
        }
        return res.toArray(new int[0][]);
    }
}

/* =========================================================
   206. Reverse Linked List
========================================================= */
class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}

/* =========================================================
   21. Merge Two Sorted Lists
========================================================= */
class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }

        if (l1 != null) temp.next = l1;
        if (l2 != null) temp.next = l2;

        return dummy.next;
    }
}

/* =========================================================
   509. Fibonacci Number
========================================================= */
class Fibonacci {
    public int fib(int n) {
        int[] f = new int[50];
        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }
}

/* =========================================================
   104. Maximum Depth of Binary Tree
========================================================= */
class MaxDepth {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}

/* =========================================================
   100. Same Tree
========================================================= */
class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;

        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }
}

/* =========================================================
   101. Symmetric Tree
========================================================= */
class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode a, TreeNode b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        if (a.val != b.val) return false;

        return isMirror(a.left, b.right) &&
               isMirror(a.right, b.left);
    }
}

/* =========================================================
   Helper Classes (for compilation)
========================================================= */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

// 222. Count Complete Tree Nodes

class Solution {
    int height(TreeNode root) {
        return root == null ? -1 : 1 + height(root.left);
    }
    public int countNodes(TreeNode root) {
        int h = height(root);
        return h < 0 ? 0 :
               height(root.right) == h-1 ? (1 << h) + countNodes(root.right)
                                         : (1 << h-1) + countNodes(root.left);
    }
}


//  144. Binary Tree Preorder Traversal
class Solution1 {
    List<Integer> preorderTraverse(TreeNode root,List<Integer> list) {

        if(root==null)
            return list;
        list.add(root.val);
        preorderTraverse(root.left,list);
        preorderTraverse(root.right,list);
        return list;
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        list = preorderTraverse(root,list);
        return list;
    }
}