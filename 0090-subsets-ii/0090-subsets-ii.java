class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        Arrays.sort(nums);
        subset(nums , 0 , current , res);
        return res;
    }
    public static void subset(int[] num , int index , List<Integer> current , List<List<Integer>> res){
        res.add(new ArrayList<>(current));
        for(int i = index ; i<num.length; i++){
            if(i > index && num[i] == num[i-1]){
                continue;
            }
            current.add(num[i]);
            subset(num , i + 1 , current , res);
            current.remove(current.size()-1);
        }
    }
}