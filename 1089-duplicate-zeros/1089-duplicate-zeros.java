class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zero = 0;

        for(int num : arr){
            if( num == 0){
                zero++;
            }
        }

        int i = n-1;
        int j = n+zero-1;

        while(i >= 0){
            if(j < n){
                arr[j] = arr[i];
            }
            if(arr[i] == 0){
                j--;
                if( j<n){
                    arr[j] = 0;
                }
            }
            i--;
            j--;
        }
    }
}