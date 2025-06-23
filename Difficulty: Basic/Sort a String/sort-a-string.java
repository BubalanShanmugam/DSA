// User function Template for Java
class Solution {
    String sort(String s) {
        // code here
        char [] c = s.toCharArray();
        Arrays.sort(c);
        s = new String (c);
        return s ;
    }
}