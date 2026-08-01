class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        ArrayList<String> str = new ArrayList<>();

        for(int i=0; i<12; i++){
            for(int j=0; j<60; j++){
                int total = Integer.bitCount(i) + Integer.bitCount(j);
                if(total == turnedOn){
                    String time = i + ":"+ (j<10 ? "0" + j : j);
                    str.add(time); 
                }
            }
        }
        return str;
    }
}