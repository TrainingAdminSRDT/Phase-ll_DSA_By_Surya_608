// Leetcode Problem Number: 2235. Add Two Integers
class Solution {
    public int sum(int num1, int num2) {
        return num1 + num2;
    }
};

// Leetcode Problem Number: 7. Reverse Integer
class Solution {
    public int reverse(int x) {
        long n = x;
        if(n < 0) n = -n;
        StringBuilder sb = new StringBuilder(Long.toString(n));
        long k = Long.parseLong(sb.reverse().toString());
        if(x < 0) k = -k;
        if(k < Integer.MIN_VALUE || k > Integer.MAX_VALUE) return 0;
        return (int)k;
    }
};

// Leetcode Problem Number: 136. Single Number

class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int num : nums) ans ^= num;
        return ans;
    }
};

// Leetcode Problem Number: 169. Majority Element
 
class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0,m=0;
        for(int x:nums){
            if(cnt==0){m=x;cnt=1;}
            else cnt += (m==x)?1:-1;
        }
        return m;
    }
};

// Leetcode Problem Number: 26. Remove Duplicates from Sorted Array
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]) nums[++i]=nums[j];
        }
        return i+1;
    }
};

// Leetcode Problem Number: 1480. Running Sum of 1D Array
class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++) nums[i]+=nums[i-1];
        return nums;
    }
}

// Leetcode Problem Number: 53. Maximum Subarray
class Solution {
    public int maxSubArray(int[] nums) {
        int curr=nums[0], max=nums[0];
        for(int i=1;i<nums.length;i++){
            curr=Math.max(nums[i], curr+nums[i]);
            max=Math.max(max,curr);
        }
        return max;
    }
}

// Leetcode Problem Number: 704. Binary Search
class Solution {
    public int search(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]==target) return m;
            if(nums[m]<target) l=m+1;
            else r=m-1;
        }
        return -1;
    }
}

// Leetcode Problem Number: 242. Valid Anagram
import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
 }
// Leetcode Problem Number: 509. Fibonacci Number
class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        int a=0,b=1;
        for(int i=2;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
}

// Leetcode Problem Number: Push and Pop Operation
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(9);
        st.push(7);
        st.pop();
    }
}

// Leetcode Problem Number: LIFO String Processing
import java.util.*;
public class Main {
    public static void main(String[] args) {
        String s="abc#d###f";
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='#'){
                if(!st.isEmpty()) st.pop();
            }else st.push(ch);
        }
    }
}

// Leetcode Problem Number: Undo Redo Operation
import java.util.Stack;
public class Main {
    static Stack<Character> st=new Stack<>();
}
// Leetcode Problem Number: 104. Maximum Depth of Binary Tree
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
// Leetcode Problem Number:100. Same Tree
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Base case: If both trees are empty, they are identical.
        if (p == null && q == null) {
            return true;
        }
        // If one of the trees is empty and the other is not, they are not identical.
        if (p == null || q == null) {
            return false;
        }
        
        // Compare the values of the current nodes.
        if (p.val != q.val) {
            return false;
        }
        
        // Recursively check the left and right subtrees.
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }    
}

 // Leetcode Problem Number:104. Maximum Depth of Binary Tree
 class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
        return 1 + Math.max(left, right);
    }
}
 // Leetcode Problem Number: 101. Symmetric Tree
 class Solution {
    public boolean isSymmetric(TreeNode root) {
        // Soecial case...
        if (root == null)
		    return true;
        // call the function  recursively...
	    return isSymmetric(root.left, root.right);
    }
    // After division the tree will be divided in two parts...
    // The root of the left part is rootleft & the root of the right part is rootright...
    public boolean isSymmetric(TreeNode rootleft, TreeNode rootright) {
        // If root of the left part & the root of the right part is same, return true...
	    if (rootleft == null && rootright == null) {
		    return true;
	    }
        // If root of any part is null, then the binary tree is not symmetric. So return false...
        else if (rootright == null || rootleft == null) {
		    return false;
	    }
        // If the value of the root of the left part is not equal to the value of the root of the right part...
        if (rootleft.val != rootright.val)
		    return false;
        // In case of not symmetric...
        if (!isSymmetric(rootleft.left, rootright.right))
		    return false;
	    if (!isSymmetric(rootleft.right, rootright.left))
		    return false;
        // Otherwise, return true...
        return true;
    }
}

