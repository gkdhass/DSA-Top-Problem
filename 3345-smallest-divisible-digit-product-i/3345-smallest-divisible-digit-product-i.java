class Solution {
    public int smallestNumber(int n, int t) {
        int num = n;

        while(true){
            int sum = 1;
            int temp = num;

            while(temp > 0){
                int digit = temp % 10;
                sum = sum * digit;
                temp /= 10;
            }

            if(sum % t == 0){
                return num;
            }
            num++;
        }

    }
}