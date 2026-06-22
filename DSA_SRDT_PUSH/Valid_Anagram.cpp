class Solution {
public:
    bool isAnagram(string s, string t) {
        sort(s.begin(),s.end());
        sort(t.begin(),t.end());
        return s==t;


        // if(s.size() != t.size()) return false;

        // vector<int> count(26, 0);

        // // Count characters of s
        // for(int i = 0; i < s.size(); i++) {
        //     count[s[i] - 'a']++;
        // }

        // // Subtract characters of t
        // for(int i = 0; i < t.size(); i++) {
        //     count[t[i] - 'a']--;
        // }

        // // Check if all values are zero
        // for(int i = 0; i < 26; i++) {
        //     if(count[i] != 0) {
        //         return false;
        //     }
        // }

        return true;
    }
};

