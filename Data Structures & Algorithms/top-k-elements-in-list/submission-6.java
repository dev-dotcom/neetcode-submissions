class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        List<int[]> lst = new ArrayList<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0) + 1);
        }

        for(int key : map.keySet()){
            lst.add(new int[] {map.get(key), key});
        }

        lst.sort((a,b) -> b[0] - a[0]);

        int[] res = new int[k];
        for(int i =0; i< k; i++){
            res[i] = lst.get(i)[1];
        }


        return res;
    }
}
