class Solution {
    public int lengthOfLongestSubstring(String s) {
       int start = 0;
       int end = 0;
       int max = 0;

       Set<Character> set = new HashSet<>();
       while(end < s.length()){
        char ch = s.charAt(end);

        while(set.contains(ch)){
            set.remove(s.charAt(start));
            start++;
        }
        set.add(ch);
        int num = end - start+1;
        max = Math.max(num,max);
        end++;
       } 
       return max;
    }
}
