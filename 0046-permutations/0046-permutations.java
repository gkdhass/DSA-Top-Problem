class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        permutation(nums , used , current , res);
        return res;
    }
    static void permutation(int[] num , boolean[] used ,  List<Integer> current , List<List<Integer>> res ){
        if(current.size() == num.length){
            res.add(new ArrayList<>(current));
        }
        for(int i=0; i<num.length; i++){
            if(used[i]){
                continue;
            }
            current.add(num[i]);
            used[i] = true;
            
            permutation(num , used , current , res);
            current.remove(current.size()-1);
            used[i] = false;
        }
    }
}