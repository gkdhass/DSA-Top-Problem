class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int left = 0;
        int zero = 0;
        int max = 0;

        for(int right=0; right<n; right++){
            if(nums[right] == 0){
                zero++;
            }
            while(zero > 1){
                if(nums[left] == 0){
                    zero--;
                }
                left++;
            }
            int sum = right - left + 1 - zero;
            max = Math.max(max,sum);
        }
        return (max == n) ? max-1 : max;
    }
}