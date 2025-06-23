class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(int i =0; i< tokens.length;i++){
            if(tokens[i].equals("+")){
                int v1 = s.pop();
                int v2 = s.pop();
                s.push(v2+v1);
            }
            else if(tokens[i].equals("*")){
                int v1 = s.pop();
                int v2 = s.pop();
                s.push(v2*v1);
            }
            else if(tokens[i].equals("-")){
                int v1 = s.pop();
                int v2 = s.pop();
                s.push(v2-v1);
            }
            else if(tokens[i].equals("/")){
                int v1 = s.pop();
                int v2 = s.pop();
                s.push(v2/v1);
            }
            else{
                s.push(Integer.parseInt(tokens[i]));
            }
        }
        return s.peek();
    }
}