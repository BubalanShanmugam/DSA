class Solution {
    public int minCost(String colors, int[] t) {
        // int sum=0;
        // StringBuilder s = new StringBuilder(colors);
        // int i=s.length()-1;
        // while(i>0){
        //     int j = i;
        //     if(s.charAt(i) == s.charAt(i-1)){
        //         // s.delete(Math.min(t[i-1],t[i]), Math.min(t[i-1],t[i])+1);
        //         s.deleteCharAt(i);
        //         sum += Math.min(t[i], t[i-1]);
        //         i=j;
        //     }
        //     i--;
        // }
        // return sum;



        int sum =0;
        int i =0;
        while(i< colors.length()-1){
            int j =i+1;
            if(i+1 < colors.length() && colors.charAt(i)==colors.charAt(j)){            
                int max=Integer.MIN_VALUE;
                while( j < colors.length() && colors.charAt(i)==colors.charAt(j)){
                    j++;
                }
                for(int k=j-1;k>=i;k--){
                    sum += t[k];
                    max = Math.max(t[k],max);
                }
                sum -= max;
                i = j;
            }
            else{
                i++;
            }
        }
        return sum;
    }
}