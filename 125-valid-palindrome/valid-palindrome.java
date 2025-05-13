class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]","");

        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        String str = String.valueOf(sb);

        if(s .equals(str)){
            return true;
        }
        else{
            return false;
        }
    }
}