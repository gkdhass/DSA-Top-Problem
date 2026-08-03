class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        // int sum1 = 0;
        // int sum2 = 0;
        // for(int n1 : target){
        //     sum1 += n1;
        // }
        // for(int n2 : arr){
        //     sum2 += n2;
        // }
        // if(sum1 == sum2){
        //     return true;
        // }
        // return false;

        Arrays.sort(target);
        Arrays.sort(arr);

        return Arrays.equals(target , arr);
    }
}