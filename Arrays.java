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