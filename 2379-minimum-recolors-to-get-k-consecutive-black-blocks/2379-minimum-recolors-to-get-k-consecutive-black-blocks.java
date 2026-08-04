class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left = 0;
        int w = 0;
        int sum = Integer.MAX_VALUE;

        for(int right = 0; right<blocks.length(); right++){
            if(blocks.charAt(right) == 'W'){
                w++;
            }

            if(right - left + 1 == k){
                sum = Math.min(w,sum);

                if(blocks.charAt(left) == 'W'){
                    w--;
                }
                left++;
            }
            
        }
        return sum;
    }
}