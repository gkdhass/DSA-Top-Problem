class Solution {
    public int numberOfWays(int n, int x) {
        long[] dhass = new long[n+1];
        dhass[0] = 1;

        for(int i=1; Math.pow(i,x) <= n; i++){
            int p = (int) Math.pow(i,x);
            for(int m=n; p<=m; m--){
                dhass[m] += dhass[m-p];
            }
        }
        return (int) (dhass[n] % 1000000007);
    }
}