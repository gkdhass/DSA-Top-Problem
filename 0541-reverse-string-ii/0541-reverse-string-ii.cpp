class Solution {
public:
    string reverseStr(string s, int k) {
        vector<char>ch(s.begin(),s.end());

        for(int i=0; i<s.size(); i+= 2 * k){
            int l = i;
            int r = min(i+k , (int)s.size()) - 1;

            while(l < r){
                char temp = ch[l];
                ch[l] = ch[r];
                ch[r] = temp;
                l++;
                r--;
            }
        }
        return string(ch.begin() , ch.end());
    }
};