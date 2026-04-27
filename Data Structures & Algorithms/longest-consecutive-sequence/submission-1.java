class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int num : nums){
            s.add(num);
        }

        int longest = 0;
        for(int n : nums){
            if(!s.contains(n-1)){
                int length = 1;

                while(s.contains(n + length)){
                    length++;
                }
                longest = Math.max(longest,length);
            }
            
        }
        return longest;     
    }
}
