// Problem number:7
class Solution {
public:
    int reverse(int x) {
      int ans =0;
       while(x){
        int digit =x%10;
         if(ans > INT_MAX/10 || ans < INT_MIN/10){
        return 0;
       } 
        ans = ans*10 + digit;
        x=x/10;
       }
       return ans;
    }
};
// Problem number:258
class Solution {
public:
    int addDigits(int num) {
    return (num-1)%9 +1;
    }
};
// Proble number:136
class Solution {
public:
    int singleNumber(vector<int>& nums) {
     int ans =0;
     for(int x: nums){
        ans = ans ^ x;

     }
     return ans;   
    }

};

// Problem number:169
class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int cnt =0;
        int m =0;
        for(int x:nums){
            if(cnt == 0){
            m =x;
            cnt =1;
            }else{
                // cnt +=m==x ? 1 : -1;
                if(m==x){
                    cnt=cnt+1;
                }else{
                    cnt=cnt-1;
                }
            }
        }
        return m;
    }
}; 
// Problem number:26
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
      int k=0;
      for(int x:nums){
        if(k==0 || x!=nums[k-1]){
            nums[k++]=x;
        }
      }  
      return k;
    }
};

// Problem number:53
class Solution {
public:
    int maxSubArray(vector<int>& nums) {
      int currsum = nums[0];
      int maxsum = nums[0];
      for(int i=1;i<nums.size();i++){
        currsum = max(nums[i], currsum + nums[i]);
        maxsum = max(currsum, maxsum);
      }return maxsum;  
    }
};

// Problem number:1480
class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        int n = nums.size();
     for(int i=1 ; i<n; i++){
        nums[i]+= nums[i-1];
     }   
     return nums;
    }
};

//Problem number:643
class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
    int n = nums.size();
    int sum = 0;
    for(int i=0; i<k;i++){
        sum += nums[i];
    }    
    int maxSum = sum;
    for(int i=k;i<n;i++){
        sum = sum - nums[i-k] + nums[i];
        if(sum >maxSum){
        maxSum = sum;
        }
    }return (double) maxSum / k;
    }
};

// Problem number:283
class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
    int n = nums.size();
    int sum = 0;
    for(int i=0; i<k;i++){
        sum += nums[i];
    }    
    int maxSum = sum;
    for(int i=k;i<n;i++){
        sum = sum - nums[i-k] + nums[i];
        if(sum >maxSum){
        maxSum = sum;
        }
    }return (double) maxSum / k;
    }
};
//Problem number:88
class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
    int n = nums.size();
    int sum = 0;
    for(int i=0; i<k;i++){
        sum += nums[i];
    }    
    int maxSum = sum;
    for(int i=k;i<n;i++){
        sum = sum - nums[i-k] + nums[i];
        if(sum >maxSum){
        maxSum = sum;
        }
    }return (double) maxSum / k;
    }
};
//Problem number:977
class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        for (int i = 0; i < nums.size(); i++) {
            nums[i] = nums[i] * nums[i];
        }

        sort(nums.begin(), nums.end());

        return nums;
    }
};
//Problem number:2090
class Solution {
public:
    vector<int> getAverages(vector<int>& nums, int k) {
       int n=nums.size();
       vector<int> ans(n,-1);
       long long s=0;
       for(int i=0; i<n;i++){
        s+=nums[i];
        if(i>=k*2){
            ans[i-k] = s/(k*2+1);
            s-= nums[i-k*2];
        }
       } 
       return ans;

    }
};
//Problem number:704
lass Solution {
public:
    int search(vector<int>& nums, int target) {
      int n=nums.size() ; 
      int low=0, high=n-1;
      while (low <= high) {
        int mid = low + (high - low) / 2;

        if (nums[mid] == target) {
            return mid;
        }
        else if (nums[mid] < target) {
            low = mid + 1;
        }
        else {
            high = mid - 1;
        }
    }
    return -1;
      }  
    
};
// Problem number:1
class Solution{
    public:
    vector<int> twoSum(vector<int>& nums, int target) {
     int n = nums.size();
     for(int i=0; i<n-1;i++){
        for(int j=i+1; j<n; j++){
           if(nums[i]+nums[j]==target){
            return {i,j};
           }
        }
     }return {};
    }
    };
// Problem number:35
class Solution {
public:
    int searchInsert(vector<int>& nums, int target){
        int low=0;
        int high=nums.size();
        int mid;
        if(target>nums[high-1]){
            return high;
        }while(low<=high){
            mid=(low+high)/2;
            if(target==nums[mid]){
                return mid;
            }if(target<nums[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }return low;
    }
};
//Problem number:367
class Solution {
public:
    bool isPerfectSquare(int num) {
      if (num <2)
         return true;
      long long left=2;
      long long right=num/2;
      while (left<=right){
        long long mid = (left+right)/2;
        long long squared =mid*mid;}
        if (squared ==num){ 
           return true;}
        else if(squared ==num){
           left=mid+1;}
        else{
          right = mid-1;}
          return false
    }
};
// Problem numbeer:56
class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        
       sort(intervals.begin(),intervals.end());
       vector<vector<int>> merged;
       vector<int> prev = intervals[0];
       for(int i=1;i<intervals.size();++i){
        if(intervals[i][0]<=prev[1]){
            prev[1]=max(prev[1], intervals[i][1]);
        }else{
            merged.push_back(prev);
            prev = intervals[i];
        }
       }
    

    merged.push_back(prev);
    return merged;}
};
//Problem number:912
class Solution {
public:
    vector<int> sortArray(vector<int>& nums) {
     sort(nums.begin(),nums.end());
     return nums;
    }
};
// Problem number:344
class Solution {
public:
    void reverseString(vector<char>& s) {
     int low = 0 ;
     int high = s.size()-1;
     while(low<high){
        swap(s[low],s[high]);
        low++;
        high--;
     } 
    }
};
//Problem number:242
class Solution {
public:
    bool isAnagram(string s, string t) {
    sort(s.begin(),s.end());
    sort(t.begin(),t.end());

        return s==t;
    }    
    
};
//Problem number:58
class Solution {
public:
    int lengthOfLastWord(string s) {
      int size=s.size();
      int count=0;
      int flag=0;
      for(int i=size-1;i>=0;i--){
        if(s[i]==' '&&flag)
           break;
        if(s[i]!=' '){
            flag=1;
            count++;
        }   
      }return count;
        
      }  
    
};
//Problem number:125
class Solution {
public:
    bool isPalindrome(string s) {
     int i=0,j=s.size()-1;
     while(i<j){
        if(!isalnum(s[i])){
            ++i;
        }else if(!isalnum(s[j])){
            --j;
        }else if(tolower(s[i])!=tolower(s[j])){
            return false;
        }else{
        ++i;
        --j;}
     }return true;
    }
};
//Problem number:160
class Solution {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        ListNode *a = headA;
        ListNode *b = headB;
        while(a!=b){
            a= a ? a -> next:headB;
            b=b?b-> next:headA;
        }return a;
    }
};
//Problem number:141
class Solution {
public:
    bool hasCycle(ListNode *head) {
    ListNode *fast = head;
    ListNode *slow = head;
    while(fast && fast ->next){
        slow = slow->next;
        fast = fast->next->next;
    if(slow==fast)
        return true;
    }
        return false;
    
    }
};
// Problem number:206
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
     ListNode* prev =nullptr;
     ListNode* curr = head;
     while(curr!=nullptr){
        ListNode* temp = curr -> next;
        curr->next = prev;
        prev = curr;
        curr = temp;
     }   return prev;
    }
};
//Problem number:21
class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
       
        if (list1 == nullptr) return list2;
        if (list2 == nullptr) return list1;

        if (list1->val <= list2->val) {
            list1->next = mergeTwoLists(list1->next, list2);
            return list1;
        }

        list2->next = mergeTwoLists(list1, list2->next);
        return list2;

    }
};


