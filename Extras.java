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