class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> hashMap = new HashMap<>();

        for (String s : strs){

            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String sortedString = new String(temp);

            if (!hashMap.containsKey(sortedString)){
                hashMap.put(sortedString,new ArrayList<>());
            }
            hashMap.get(sortedString).add(s);

        }
        return new ArrayList<>(hashMap.values());
        
    }
}
