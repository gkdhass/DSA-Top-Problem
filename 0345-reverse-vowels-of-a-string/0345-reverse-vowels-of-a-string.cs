public class Solution {
    public string ReverseVowels(string s) {
        char[] ch = s.ToCharArray();
        int i =0; 
        int j= ch.Length-1;

        while(i<j){
            while(i<j && !isvol(ch[i])) i++;
            while(i<j && !isvol(ch[j])) j--;

            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;

            i++;
            j--;
        }
        return new string(ch);
    }
    public bool isvol(char ch){
        char c = char.ToLower(ch);
        if(c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u'){
            return true;
        }
        return false;
    }
}