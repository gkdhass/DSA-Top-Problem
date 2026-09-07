class Solution {
public:
    int differenceOfSum(vector<int>& nums) {
        int e_sum = 0;
        int d_sum = 0;
        for(int i=0; i<nums.size(); i++){
            e_sum += nums[i];

            int num = nums[i];

            while(num > 0){
                int digit = num % 10;
                d_sum = d_sum + digit;
                num = num/10;
            }
        }
        int sum = e_sum - d_sum;
        return sum;
    }
};