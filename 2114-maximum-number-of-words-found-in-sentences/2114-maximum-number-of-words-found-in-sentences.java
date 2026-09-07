class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        int count = 0;
        
        for(int i=0; i<sentences.length; i++){
            count = sentences[i].trim().split("\\s+").length;
            max = Math.max(max , count);
        }
        return max;
        
    }
}