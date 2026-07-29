class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0){
            return 0;
        }
        char[] ch1 = haystack.toCharArray();
        char[] ch2 = needle.toCharArray();

        int ind = -1;

        for(int i=0; i<=ch1.length - ch2.length; i++){
            int j;
            for(j=0; j<ch2.length; j++){
                if(ch1[i+j] != ch2[j]){
                    break;
                }
            }
            if(j == ch2.length){
                ind = i ;
                break;
            }
        }
        return ind;
    }
}