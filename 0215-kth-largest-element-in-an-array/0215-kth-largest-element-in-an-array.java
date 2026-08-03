class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;

        // for(int i=0; i<n-1; i++){
        //     for(int j=0; j<n-1-i; j++){
        //         if(nums[j] > nums[j+1]){
        //             int temp = nums[j];
        //             nums[j] = nums[j+1];
        //             nums[j+1] = temp;
        //         }
        //     }
        // }

        Arrays.sort(nums);
        return nums[n-k];
    }
}