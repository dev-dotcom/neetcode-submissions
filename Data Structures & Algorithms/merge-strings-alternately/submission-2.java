class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l = 0;
        int r = 0;

        StringBuilder s = new StringBuilder();

        while(l < word1.length() && r < word2.length()){
            s.append(word1.charAt(l)).append(word2.charAt(r));
            l++;
            r++;
        } 

        if(l < word1.length()){
            s.append(word1.substring(l));
            l++;
        }
        else{
            s.append(word2.substring(r));
            r++;
        }

        return s.toString();
    }
}