#include <bits/stdc++.h>
using namespace std;

stack<char> st;

string undo(string &s) {
    char elem = s[s.length() - 1];
    st.push(elem);
    s.pop_back();
    return s;
}

string redo(string &s) {
    char elem = st.top();
    st.pop();
    s += elem;
    return s;
}

int main() {
    string s = "abcd";

    cout << undo(s) << endl;
    cout << redo(s);

    return 0;
}