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