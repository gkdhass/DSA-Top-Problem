class Solution {
    public int maxArea(int[] nums) {
       int i =0;
       int j = nums.length-1;
       int n =0;

       while(i<j){
        int weight = j-i;
        int height = Math.min(nums[i],nums[j]);
        int length = weight * height;
        n = Math.max(n,length);
        if(nums[i] < nums[j]){
            i++;
        }
        else{
            j--;
        }
       }
       return n;

    }
}
