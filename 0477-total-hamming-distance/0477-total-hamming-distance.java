class Solution {
    public int totalHammingDistance(int[] nums) {
        int count = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                count += Integer.bitCount(nums[i] ^ nums[j]);
            }
        }
        return count;
    }
}