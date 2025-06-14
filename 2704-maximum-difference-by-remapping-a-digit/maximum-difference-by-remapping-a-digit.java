class Solution {
    public int minMaxDifference(int num) {
        // char [] chars = Integer.toString(num).toCharArray();
        // char c= chars[0];
        String strs = String.valueOf(num);
        // String str = String.valueOf(chars[0]);
        // String s = new String(chars);
        int max =Integer.parseInt(strs);
        int min =Integer.parseInt(strs);;
       
        for(int i =0; i<strs.length();i++){
            if(strs.charAt(i)<'9'){
                max = Integer.parseInt(strs.replace(strs.charAt(i)+"","9"));
                break;
            }
        }
        for(int i =0; i<strs.length();i++){
            if(strs.charAt(i)>'0'){
                min = Integer.parseInt(strs.replace(strs.charAt(i)+"","0"));
                break;
            }
        }
    
        return max-min;
    }
}