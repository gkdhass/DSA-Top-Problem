class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m*n;
        k %= total;

        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<m; i++){
            List<Integer> arr = new ArrayList<>();
            for(int j=0; j<n; j++){
                arr.add(0);
            }
            list.add(arr);
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int old = i * n + j;

                int newIndex = (old + k) % total;

                int nr = newIndex / n;
                int nc = newIndex % n;

                list.get(nr).set(nc , grid[i][j]);
            }
        }
        return list;

        
    }
}