/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var findMaxAverage = function(nums, k) {
    let n = nums.length;
    let sum = 0;
    for(let i=0; i<k; i++){
        sum += nums[i];
    }
    let max = sum;
    for(let i=k; i<n; i++){
        sum = sum + nums[i] - nums[i-k];
        max = Math.max(sum,max);
    }
    let num = max/k;
    return num;
};