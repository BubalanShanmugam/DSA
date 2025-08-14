class Solution {
    public String largestGoodInteger(String num) {
        // int n = 999;
        
        // while(n>0)
        // {
        //     if(num.contains(String.valueOf(n))){
        //         return String.valueOf(n);
        //     }
        //     n -= 111;
        // }
        // if(num.contains("000")) return "000";
        // else return "";
        int max =-1;
        int i =0;
        while(i<num.length()-2){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i)==num.charAt(i+2)){
                max = Math.max(max, Integer.parseInt(num.substring(i,i+3)));
                i=i+2;
            }
            i=i+1;
        }
        if(max == -1) return "";
        if(max == 0) return "000";
        return String.valueOf(max);
    }
}