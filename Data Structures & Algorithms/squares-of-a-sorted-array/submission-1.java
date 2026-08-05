class Solution {
    public int[] sortedSquares(int[] nums) {
        int n =nums.length;
        int[] sum = new int[n];

        for(int i=0; i<n; i++){
            sum[i] = nums[i] * nums[i];
        }
        Arrays.sort(sum);
        return sum;
    }
}