class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);
        }
        List<int[]> lst = new ArrayList<>();

        for (int num : freqMap.keySet()) {
            lst.add(new int[] {freqMap.get(num), num});
        }

        lst.sort((a, b) -> b[0] - a[0]);

        int[] arr = new int[k];
        for (int j = 0; j < k; j++) {
            arr[j] = lst.get(j)[1];
        }

        return arr;
    }
}