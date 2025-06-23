class Solution {

    String maxOdd(String s) {
        // code here
        char [] c = s.toCharArray();
        for(int i =c.length-1;i>=0;i--){
            if(c[i]%2 == 1){
                return s.substring( 0, i+1);
            }
        }
        return "";
    }
}