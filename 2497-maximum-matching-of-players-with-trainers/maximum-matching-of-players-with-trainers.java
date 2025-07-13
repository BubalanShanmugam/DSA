class Solution {
    public int matchPlayersAndTrainers(int[] p, int[] t) {
        // int count=0;
        // for(int i =0;i<t.length&&i<p.length;i++){
        //     if(p[i]<=t[i]) count++;
        // }
        // return count;
        Arrays.sort(p);
        Arrays.sort(t);
        int count=0;
        int i=0;
        int j=0;
        while(i<p.length && t.length>j){
            if(p[i]<=t[j]){
                count++;
                i++;j++;
            }
            else{
                j++;
            }
        }
        return count;
    }
}