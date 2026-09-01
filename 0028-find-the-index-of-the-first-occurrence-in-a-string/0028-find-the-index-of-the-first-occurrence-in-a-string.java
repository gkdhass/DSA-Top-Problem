class Solution {
    public int strStr(String haystack, String needle) {
        int n1 = haystack.length();
        int n2 = needle.length();

        for(int i=0; i<=n1-n2; i++){ 
            boolean found = true;
            for(int j=0; j<n2; j++){
                if(haystack.charAt(i+j) != needle.charAt(j)){
                    found = false;
                    break;
                }
            }
            if(found){
                return i;
            }
        }
        return -1;
    }
}