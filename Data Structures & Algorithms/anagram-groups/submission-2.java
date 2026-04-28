class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        List<List<String>> lst = new ArrayList<>();

        for(int i = 0; i < strs.length; i++){
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String sortedString = new String(temp);

            if(!map.containsKey(sortedString)){
                map.put(sortedString, new ArrayList<>());
            }
            map.get(sortedString).add(strs[i]);
        }

        for(String s : map.keySet()){
            lst.add(map.get(s));
        }
        return lst;
    }
}
