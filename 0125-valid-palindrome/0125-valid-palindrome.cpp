class Solution {
public:
    bool isPalindrome(string s) {
        
        string ch = "";

        for(char c : s){
            if(isalnum(c)){
                ch += tolower(c);
            }
        }

        int i = 0;
        int j = ch.length()-1;
        while(i < j){
            if(tolower(ch[i]) != tolower(ch[j])){
                return false;
            }
            i++;
            j--;
        }
        return true;;
    }
    
};