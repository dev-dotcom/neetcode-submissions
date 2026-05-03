class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int l = 0;
        int r = people.length -1;
        int boats  = 0;

        Arrays.sort(people);

        while(l<=r){
            int remain = limit - people[r];
            r--;
            boats++;
            if(l<=r && people[l] <= remain){
                l++;
            }
        }
        return boats;
    }
}