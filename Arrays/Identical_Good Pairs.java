class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodpair=0;
        int[] freq=new int[102];
        for(int c:nums){
            freq[c]++;
        }

        for(int c:freq){
            goodpair+=(c*(c-1))/2;
        }

        return goodpair;
    }
}