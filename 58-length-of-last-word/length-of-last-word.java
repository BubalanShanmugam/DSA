class Solution {
    public int lengthOfLastWord(String s) {
        String[] strarr=s.split(" ");

        String str = strarr[strarr.length -1];
        return str.length();
    }
}