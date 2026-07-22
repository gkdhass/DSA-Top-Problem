/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    let str = s.toLowerCase();
    let n = str.replace(/[^a-z0-9]/g , "");
    let left = 0;
    let right = n.length-1;

    while(left < right){
        if(n[left] != n[right]){
            return false;
        }
        left++;
        right--;
    }
    return true;
};