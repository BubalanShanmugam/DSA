class Solution {
    public int maxFreqSum(String s) {
        int [] hash = new int[26];
        int cmax =0;
        int vmax =0;

        for(char c : s.toCharArray()){
            hash[c -'a']= hash[c-'a']+1;
        }

        for(int i=0;i<26;i++){
            if((i==0 || i==4||i==8||i==14||i==20)){
                vmax=Math.max(vmax,hash[i]);
            }
            else{
                cmax=Math.max(cmax,hash[i]);
            }
        }
        return vmax + cmax;

    }
}