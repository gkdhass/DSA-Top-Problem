class Solution {
public:
    bool canAliceWin(vector<int>& nums) {
        int s_num = 0;
        int d_num = 0;
        for(int i=0; i<nums.size(); i++){
            if(nums[i] <= 9){
                s_num += nums[i];
            }
            else{
                d_num += nums[i];
            }
        }
        if(s_num < d_num || s_num > d_num){
            return true;
        }
        else{
            return false;
        }
    }
};