class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        List<List<String>> lst = new ArrayList<>();

        for(String s : strs){

            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String sortedString  = new String(temp);

            if(!map.containsKey(sortedString)){
                map.put(sortedString, new ArrayList<>());
            }

            map.get(sortedString).add(s);

        }

        for(String s : map.keySet()){
            lst.add(map.get(s));
        }

        return lst;
    }
}
