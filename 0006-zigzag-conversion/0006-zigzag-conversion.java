class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;

        StringBuilder[] box = new StringBuilder[numRows];
        for(int i=0; i<numRows; i++){
            box[i] = new StringBuilder();
        }
        int row =0;
        int dir = 1;

        for(int i=0; i<s.length(); i++){
            box[row].append(s.charAt(i));

            if(row == numRows - 1){
                dir = -1;
            }
            if(row == 0){
                dir = 1;
            }
            row = row + dir;
        }
        StringBuilder res = new StringBuilder();

        for(int i=0; i<numRows; i++){
            res.append(box[i]);
        }
        return res.toString();
    }
}