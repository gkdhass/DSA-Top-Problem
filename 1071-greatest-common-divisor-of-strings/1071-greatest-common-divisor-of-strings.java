class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1)){
            return "";
        }

        int num = gcd(str1.length(),str2.length());

        return str1.substring(0,num);
    }
    static int gcd(int a , int b){
        while(b != 0){
            int num = a % b;
            a = b;
            b = num;
        }
        return a;
    }
}