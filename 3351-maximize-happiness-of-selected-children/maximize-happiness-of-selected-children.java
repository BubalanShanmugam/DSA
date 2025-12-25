class Solution {
    public long maximumHappinessSum(int[] h, int k) {
        // int result =0;
        // while(k>0){
        //     result += Arrays.stream(h).max().getAsInt();

        //     Arrays.setAll(h, i -> h[i]>0? h[i]-1: 0);
        //     k--;
        // }
        // return result;
        Arrays.sort(h);
        long result =0;
        // result += Arrays.stream(h).max().getAsInt();
        for(int i=0;i<k;i++){            
            result += Math.max(0, h[h.length - 1 - i] - i);
        }
        return result;
    }
}