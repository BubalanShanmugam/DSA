class Solution {
    public int lengthOfLongestSubstring(String s) {
   
        // HashSet<Character> set = new HashSet<>();
        // for(char c: s.toCharArray()){
        //     set.add(c);
        // }
        // return set.size();

        int max = 0;
        Set<Character> set = new HashSet<>();
        int left =0;
        int right=0;

        while(right<s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                max = Math.max(max, right-left+1);
                right++;
            }
            else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}