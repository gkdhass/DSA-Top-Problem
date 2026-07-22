/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var longestOnes = function(nums, k) {
    let n = nums.length;
    let zero = 0;
    let maxlen = 0;
    let one = 0;

    for(let i=0; i<n; i++){
        if(nums[i] == 0){
            zero++;
        }
        while(zero > k){
            if(nums[one] == 0){
                zero--;
            }
            one++;
        }
        maxlen = Math.max(maxlen , i-one+1);
    }
    return maxlen;
    
};