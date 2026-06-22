class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> num = new HashSet<>();
        for(int c : nums){
            num.add(c);
        }
        int a = 0;
        for(int c : nums){
            if(!num.contains(c-1)){
                int cur = c;
                int count = 1;
                while(num.contains(cur + 1)){
                    cur++;
                    count++;
                }
                a = Math.max(a, count);
            }
          
        }
        return a;
    }
}


