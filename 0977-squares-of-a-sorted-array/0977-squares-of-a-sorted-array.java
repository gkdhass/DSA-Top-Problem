class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] sum = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            sum[i] = nums[i] * nums[i];
        }

        for(int i=0; i<sum.length-1; i++){
            for(int j=0; j<sum.length-1-i; j++){
                if(sum[j] > sum[j+1]){
                    int temp = sum[j];
                    sum[j] = sum[j+1];
                    sum[j+1] = temp;
                }
            }
        }
        return sum;
    }
}