class Solution {
    int[] arr;
    public int climbStairs(int n) {
        arr = new int[n+1];
        return star(n);
    }
    public  int star(int a){
        if(a == 1) return 1;
        if(a == 2) return 2;
        if(arr[a] != 0 ) return arr[a];
        arr[a] = star(a-1) + star(a-2);
        return arr[a];
    }
}