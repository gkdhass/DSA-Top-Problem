class Solution {
    public boolean isHappy(int n) {
        for(int i=0; i<100; i++){
            if(n == 1){
                return true;
            }
            int sum = 0;
            while(n > 0){
                int d = n % 10;
                sum += d * d;
                n /= 10;
            }
            n = sum;
        }
        return false;
    }
}