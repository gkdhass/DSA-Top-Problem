class Solution {
    public boolean isValid(String s) {
        Stack<Character> ch = new Stack<>();

        for(char c : s.toCharArray()){
            if(!ch.isEmpty() && c == ')' && ch.peek() == '(' ){
                ch.pop();
            }
            else if(!ch.isEmpty() && c == ']' && ch.peek() == '[' ){
                ch.pop();
            }
            else if(!ch.isEmpty() && c == '}' && ch.peek() == '{' ){
                ch.pop();
            }
            else{
                ch.push(c);
            }
        }
        return ch.isEmpty();
    }
}