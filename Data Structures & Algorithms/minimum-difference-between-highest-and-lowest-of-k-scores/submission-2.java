class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;

        int left = 0;
        int min = Integer.MAX_VALUE;

        for(int right = k-1; right<n; right++){
            int diff = nums[right] - nums[left];
            min = Math.min(diff,min);
            left++;
        }
        return min;
    }
}