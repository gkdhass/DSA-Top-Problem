class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        subset(nums , 0, current , res);
        return res;
    }
    public static void subset(int[] num , int index , List<Integer> current , List<List<Integer>> res){
        if(index == num.length){
            res.add(new ArrayList<>(current));
            return;
        }
        current.add(num[index]);
        subset(num , index + 1 , current ,res);
        current.remove(current.size() -1);
        subset(num , index + 1 , current , res);
    }
}