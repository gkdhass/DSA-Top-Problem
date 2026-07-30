class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int left = 0;
        for(int i=0;i<n;i++){
            left += nums[i];
        }
        int right = 0;
        for(int i=0; i<n; i++){
            left = left - nums[i];
            if(left == right){
                return i;
            }
            right += nums[i];
        }
        return -1;
    }
}