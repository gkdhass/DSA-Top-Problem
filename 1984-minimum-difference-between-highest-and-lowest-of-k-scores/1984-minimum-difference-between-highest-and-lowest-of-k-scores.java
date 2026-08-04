class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;

        int min = Integer.MAX_VALUE;
        int left = 0;

        for(int right= k-1; right<n; right++){
            int diff = nums[right] - nums[left];
            min = Math.min(min , diff);
            left++;
        }
        return min;
    }
}