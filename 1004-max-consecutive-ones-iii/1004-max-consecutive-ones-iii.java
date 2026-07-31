class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int z= 0;
        int max= 0;
        int count = 0;

        for(int right=0; right<nums.length; right++){
            if(nums[right] == 0){
                z++;
                while(z>k){
                    if(nums[left] == 0){
                        z--;
                    }
                    left++;
                }
            }
            int len = right - left + 1;
            max = Math.max(max , len);
        }
        return max;
    }
}