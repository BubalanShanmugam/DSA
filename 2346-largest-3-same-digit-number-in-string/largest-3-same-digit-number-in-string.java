class Solution {
    public String largestGoodInteger(String num) {
        int n = 999;
        
        while(n>0)
        {
            if(num.contains(String.valueOf(n))){
                return String.valueOf(n);
            }
            n -= 111;
        }
        if(num.contains("000")) return "000";
        else return "";
    }
}