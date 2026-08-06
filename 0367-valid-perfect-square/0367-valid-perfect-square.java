class Solution {
    public boolean isPerfectSquare(int num) {
        int left  = 0;
        int right = num;

        while(left <= right){
            int mid = left + (right - left) / 2;
            long s = (long)mid * mid;

            if(s == num){
                return true;
            }
            else if(s < num){
                left = mid +1;
            }
            else if(s > num){
                right = mid - 1;
            }
        }
        return false;
    }
}