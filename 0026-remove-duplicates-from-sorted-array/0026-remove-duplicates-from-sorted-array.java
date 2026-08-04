class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        
        if(n == 0) return 0;

        int left = 0;

        for(int right=0; right<n; right++){
            if(nums[left] != nums[right]){
                left++;
                nums[left] = nums[right];
            }
        }
        return left + 1;
    }
}