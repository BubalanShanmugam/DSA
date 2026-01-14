class Solution {
    public String removeOuterParentheses(String s) {
        // Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int o =1;
        for(int i = 1;i<s.length();i++){
          if(s.charAt(i) == '(') {
            o++;
            if(o>1) sb.append(s.charAt(i));
            // if(!st.isEmpty()) {
            //     sb.append(c);
            // }
            // st.push(c);
          }
          else if(s.charAt(i)== ')') {
            // st.pop();
            
            if(o>1) sb.append(s.charAt(i));
            o--;
            // if(!st.isEmpty()) {
            //     sb.append(c);
            // }
          }
        }
        return sb.toString();
    }
}