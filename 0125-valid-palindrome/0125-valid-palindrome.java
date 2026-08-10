class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        String ch = str.replaceAll("[^a-z0-9]" , "");
        int left = 0;
        int right = ch.length()-1;
        while(left < right){
            if(ch.charAt(left) != ch.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}