class Solution {
    public boolean hasSameDigits(String s) {

        if(s.length()==2) {
            return s.charAt(0)==s.charAt(1);
        }

        StringBuilder sb = new StringBuilder(s);
        String pass = "";

        for(int i=0;i< sb.length()-1;i++){
            pass += ((sb.charAt(i)-'0')+(sb.charAt(i+1)-'0'))%10;
        }

        return hasSameDigits(pass);
    }
}