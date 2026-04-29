class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();

        int l = 0;
        int r = 0;

        while(l<word1.length() && r< word2.length()){
            str.append(word1.charAt(l)).append(word2.charAt(r));
            l++;
            r++;
        }
        if(l < word1.length()){
            str.append(word1.substring(l));
        }
        else{
            str.append(word2.substring(r));
        }
        return str.toString();
    }

}