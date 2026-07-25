class Solution {
    public int maxProduct(int n) {
        int left = 0;
        int right = 0;

        while(n > 0){

            int digit = n % 10;

            if(digit > left){
                right =  left;
                left = digit;
            }
            else if(digit > right){
                right = digit;
            }
            n /= 10;
        }
        return left * right;
    }
}