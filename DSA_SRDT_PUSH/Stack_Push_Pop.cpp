#include<bits/stdc++.h>
using namespace std;

int main() {
    string str = "abc#d##f";
    stack<char> s;

    int n = str.size();

    for(int i = 0; i < n; i++) {
        if(str[i] == '#') {
            if(!s.empty())
                s.pop();
        }
        else {
            s.push(str[i]);
        }
    }

    while(!s.empty()) {
        cout << s.top();
        s.pop();
    }

    return 0;
}