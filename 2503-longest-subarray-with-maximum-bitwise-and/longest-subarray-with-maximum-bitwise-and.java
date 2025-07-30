class Solution {
    public int longestSubarray(int[] nums) {
        int maxv = 0;
        for(int i: nums){
            maxv = Math.max(maxv, i);
        }

        int maxl = 0;
        int currl =0;

        for(int i: nums){
            if(i==maxv){
                currl++;
            }
            else{
                maxl = Math.max(maxl, currl);
                currl=0;
            }
        }

        return Math.max(maxl, currl);
    }
}