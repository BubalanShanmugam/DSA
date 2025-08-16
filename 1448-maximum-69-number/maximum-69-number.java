class Solution {
    public int maximum69Number (int num) {
        String [] s = String.valueOf(num).split("");

        for(int i=0;i<s.length;i++){
            if(s[i].equals("6")){
                s[i]="9";
                return Integer.parseInt(String.join("", s));
            }
        }
        return num;



        // StringBuilder sb = new StringBuilder(num);

        // for(int i=0; i < sb.length(); i++){
        //     if(sb.charAt(i)'6'){
        //         return 123;
        //         // sb.replace(i,i+1,"9");
        //         // return Integer.parseInt(sb.toString());
        //     }
        // }
        // return num;
    }
}