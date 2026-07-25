class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        int evensize = (n+1)/2;
        int oddsize  = n/2;
        int num = 0;

        int[] even = new int[evensize];
        int[] odd = new int[oddsize];

        int e = 0;
        int o = 0;

        for(int i=0; i<n; i++){
            if(i%2 == 0){
                even[e++] = nums[i];
            }
            else{
                odd[o++] = nums[i];
            }
        }

        //Des
        for(int i=0; i<evensize-1; i++){
            for(int j=0; j<evensize -1 -i; j++){
                if(even[j] > even[j+1]){
                    int temp = even[j+1];
                    even[j+1] = even[j];
                    even[j] = temp;
                }
            }
        }

        //Ase
        for(int i=0; i<oddsize-1; i++){
            for(int j=0; j<oddsize -1 -i; j++){
                if(odd[j] < odd[j+1]){
                    int temp = odd[j+1];
                    odd[j+1] = odd[j];
                    odd[j] = temp;
                }
            }
        }

        e = 0;
        o = 0;

        for(int i=0; i<n; i++){
            if(i%2 == 0){
                nums[i] = even[e++];
            }
            else{
                nums[i] = odd[o++];
            }
        }

        return nums;
    }
}