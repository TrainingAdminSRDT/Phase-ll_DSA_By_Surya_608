//Merge Two Linked Lists (21)
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1==null)
        return list2;
        else if(list2==null)
        return list1;
        else
        {
            if(list1.val<list2.val)
            {
                list1.next=mergeTwoLists(list1.next,list2);
                return list1;
            }
            else
            list2.next=mergeTwoLists(list1,list2.next);
            return list2;

        }
}
}
//Middle Of Linked List (876)
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode a=head;
        ListNode b=head;
        while(b!=null && b.next!=null)
        {
            a=a.next;
            b=b.next.next;
        }
        return a;
    }
}
//Reverse Linked List (206)
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)
        return head;
        ListNode res=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return res;
        
    }
}
//Linked List Cycle (141)
class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null)
        return false;
        ListNode a=head;
        ListNode b=head;
        while(b!=null && b.next!=null)
        {
            a=a.next;
            b=b.next.next;
            if(a==b)
            return true;
        }
        return false;
    }
}
//Intersection of Two Linked Lists (160)
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null)
        return null;
        ListNode a=headA;
        ListNode b=headB;
        while(a!=b)
        {
            a=a==null?headB:a.next;
            b=b==null?headA:b.next;
        }
        return a;
    }
}
//Detect Capital (520)
class Solution {
    public boolean detectCapitalUse(String word) {
        int n=word.length();
        if(n==1)
        return true;
        if(Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1)))
        {
            for(int i=2;i<n;i++)
            {
                if(Character.isLowerCase(word.charAt(i)))
                return false;
            }
        }
        else
        {
            for(int i=1;i<n;i++)
            {
                if(Character.isUpperCase(word.charAt(i)))
                return false;
            }
        }
        return true;
    }
}
//Length of Last Word (58)
class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length();
        int count=0;
        for(int i=n-1;i>=0;i--)
        {
            if(s.charAt(i)==' ' && count>0)
            return count;
            else if(s.charAt(i)!=' ')
            count++;
        }
        return count;
    }
}
//Valid Anagram (242)
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(arr[i]!=0)
            return false;
        }
        return true;
    }
}
//Reverse String (344)
class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        for(int i=0;i<n/2;i++)
        {
            char temp=s[i];
            s[i]=s[n-i-1];
            s[n-i-1]=temp;
        }
    }
}
//Sort an Array (912)
class Solution {
    public int[] sortArray(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }
}
//Merge Intervals (56)
class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==0)
        return new int[0][];
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> res=new ArrayList<>();
        int[] current=intervals[0];
        res.add(current);
        for(int[] interval:intervals)
        {
            if(interval[0]<=current[1])
            {
                current[1]=Math.max(current[1],interval[1]);
            }
            else
            {
                current=interval;
                res.add(current);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
//Valid Perfect Square (367)
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<2)
        return true;
        long left=2;
        long right=num/2;
        while(left<=right)
        {
            long mid=left+(right-left)/2;
            long guess=mid*mid;
            if(guess==num)
            return true;
            else if(guess>num)
            right=mid-1;
            else
            left=mid+1;
        }
        return false;
    }
}
//Search Insert Position (35)
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(nums[mid]==target)
            return mid;
            else if(nums[mid]<target)
            left=mid+1;
            else
            right=mid-1;
        }
        return left;
    }
}
//Binary Search (704)   
class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(nums[mid]==target)
            return mid;
            else if(nums[mid]<target)
            left=mid+1;
            else
            right=mid-1;
        }
        return -1;
    }
}
//K Radius Subarray Averages (2090)
class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n=nums.length;
        int[] res=new int[n];
        Arrays.fill(res,-1);
        long sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
            if(i>=2*k)
            {
                res[i-k]=(int)(sum/(2*k+1));
                sum-=nums[i-2*k];
            }
        }
        return res;
    }
}
//Palindrome Number (9)
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        int original=x;
        int reversed=0;
        while(x>0)
        {
            reversed=reversed*10+x%10;
            x/=10;
        }
        return reversed==original;
    }
}
//Square of a Sorted Array (977)
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        int left=0;
        int right=n-1;
        for(int i=n-1;i>=0;i--)
        {
            if(Math.abs(nums[left])>Math.abs(nums[right]))
            {
                res[i]=nums[left]*nums[left];
                left++;
            }
            else
            {
                res[i]=nums[right]*nums[right];
                right--;
            }
        }
        return res;
    }
}
//Merge Sorted Array (88)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>=0 && j>=0)
        {
            if(nums1[i]>nums2[j])
            {
                nums1[k]=nums1[i];
                i--;
            }
            else
            {
                nums1[k]=nums2[j];
                j--;
            }
            k--;
        }
        while(j>=0)
        {
            nums1[k]=nums2[j];
            j--;
            k--;
        }
    }
}
//Move Zeroes (283)
class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0)
            {
                nums[j]=nums[i];
                j++;
            }
        }
        while(j<n)
        {
            nums[j]=0;
            j++;
        }
    }
}
//Maximum Average Subarray I (643)
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        double max=sum;
        for(int i=k;i<n;i++)
        {
            sum+=nums[i]-nums[i-k];
            max=Math.max(max,sum);
        }
        return max/k;
    }
}
//Running Sum of 1d Array (1480)
class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        res[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            res[i]=res[i-1]+nums[i];
        }
        return res;
    }
}
//Maximum Subarray (53)
class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        int sum=nums[0];
        for(int i=1;i<n;i++)
        {
            sum=Math.max(nums[i],sum+nums[i]);
            max=Math.max(max,sum);
        }
        return max;
    }
}
//Best Time to Buy and Sell Stock (121)
class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int min=prices[0];
        int max=0;
        for(int i=1;i<n;i++)
        {
            if(prices[i]<min)
            min=prices[i];
            else if(prices[i]-min>max)
            max=prices[i]-min;
        }
        return max;
    }
}
//Remove Duplicates from Sorted Array (26)
class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n==0)
        return 0;
        int j=0;
        for(int i=1;i<n;i++)
        {
            if(nums[i]!=nums[j])
            {
                j++;
                nums[j]=nums[i];
            }
        }
        return j+1;
    }
}
//Missing Number (268)
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        for(int i=0;i<n;i++)
        {
            sum-=nums[i];
        }
        return sum;
    }
}
//Majoyity Element (169)
class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int count=0;
        int candidate=0;
        for(int num:nums)
        {
            if(count==0)
            candidate=num;
            count+= (num==candidate)?1:-1;
        }
        return candidate;
    }
}
//Single Number (136)
class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int res=0;
        for(int i=0;i<n;i++)
        {
            res^=nums[i];
        }
        return res;
    }
}
//Reverse Integer (7)
class Solution {
    public int reverse(int x) {
        int res=0;
        while(x!=0)
        {
            int pop=x%10;
            x/=10;
            if(res>Integer.MAX_VALUE/10 || (res==Integer.MAX_VALUE/10 && pop>7))
            return 0;
            if(res<Integer.MIN_VALUE/10 || (res==Integer.MIN_VALUE/10 && pop<-8))
            return 0;
            res=res*10+pop;
        }
        return res;
    }
}
//Add Digits (258)
class Solution {
    public int addDigits(int num) {
        if(num==0)
        return 0;
        else if(num%9==0)
        return 9;
        else
        return num%9;
    }
}