class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0) +1);
        }

        List<int[]> lst = new ArrayList<>();
        for(int num : map.keySet()){
            lst.add(new int[] {map.get(num),num} );
        }

        lst.sort((a,b) -> b[0]-a[0]);

        int[] arr = new int[k];
        for(int i = 0; i < k; i++){
            arr[i] = lst.get(i)[1];
        }
        return arr;
    }
}
