class Solution {
    Integer[][] dp;
    static final int mod = 1000000007;
    public int numberOfWays(int n, int x) {
        dp = new Integer[n+1][301];
        return power(n,1,x);
    }
    public int power(int t , int n, int x) {

        if( t == 0){
            return 1;
        }
        
        int pow =(int) Math.pow(n , x);

        if(pow > t){
            return 0;
        }

        if(dp[t][n] != null){
            return dp[t][n];
        }

        int a = power(t-pow , n+1 , x);
        int b = power(t,n+1,x);

        dp[t][n] = (int)(((long) a+b) % mod);

        return dp[t][n];

        
    }
}