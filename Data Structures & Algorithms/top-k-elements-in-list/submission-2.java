class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer>  map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                int freq = map.get(num) + 1;
                map.put(num,freq);
            }
            else{
                map.put(num,1);
            }

        }

        List<int[]> arr = new ArrayList<>();

        // for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        //     arr.add(new int[]{entry.getValue(),entry.getKey()});
        // }
        for(int key : map.keySet()){
            arr.add(new int[]{map.get(key),key});
        }

        arr.sort((a,b) -> b[0] - a[0]);

        int[] res = new int[k];
        for(int i = 0 ; i < res.length; i++){
            res[i] = arr.get(i)[1];
        }

        return res;
    }
}
