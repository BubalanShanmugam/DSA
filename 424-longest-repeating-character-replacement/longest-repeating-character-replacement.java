class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,r=0,len=0,max=0, maxfreq=0;
        int[] hash = new int[26];

        while(r < s.length()){
            hash[s.charAt(r)-'A']++;

            maxfreq = Math.max(maxfreq, hash[s.charAt(r)-'A']);

            if(( r-l+1)-maxfreq > k){
                hash[s.charAt(l)-'A']--;
                maxfreq=0;
                l++;
            }

            if(r-l+1-maxfreq<=k){
                max =Math.max(max, r-l+1);
            }
            r++;
        }
        return max;
    }
}