class Solution {
    // Function to reverse words in a given string
    public String reverseWords(String s) {
        // Code here
        String [] str = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i= str.length-1; i>=0; i--){
            sb.append(str[i]);
            if(i!=0){
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
}
