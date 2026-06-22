// Different approach

class Solution {
public:
    int lengthOfLastWord(string s) {
        stringstream ss(s);
        string length;

        while(ss >> length);
        return length.size();
    }
};