class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();

        int i = 0;
        int j = 0;

        StringBuilder res = new StringBuilder();

        while(i<l1 || j <l2){
            if(i < l1){
                res.append(word1.charAt(i));
                i++;
            }
            if(j < l2){
                res.append(word2.charAt(j));
                j++;
            }
        }
        return res.toString();
    }
}