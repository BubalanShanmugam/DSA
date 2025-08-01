class Solution {
    public String removeOuterParentheses(String s) {
        int len = s.length();
        if (len <= 2) return "";
        char[] c = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int open = 1;
        for (int i = 1; i < len; i++) {
            if (c[i] == '(') {
                open++;
                if (open > 1) sb.append('(');
            }
            else {
                if (open > 1) sb.append(')');
                open--;
            }
        }
        return sb.toString();
    }
}