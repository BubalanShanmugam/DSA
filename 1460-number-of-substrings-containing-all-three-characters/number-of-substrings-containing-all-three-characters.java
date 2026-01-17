class Solution {
    public int numberOfSubstrings(String s) {
        // int res =0;

        // int [] hash = new int[3];

        // for(int i=0;i<s.length();i++){
        //     Arrays.fill(hash,0);
        //     for(int j=i;j<s.length();j++){
        //         hash[s.charAt(j)-'a']=1;
        //         if(hash[0]+hash[1]+hash[2] == 3){
        //             res +=1;
        //         }
        //     }
        // }
        // return res;



        int res =0;

        int [] hash = new int[3];

        
            Arrays.fill(hash,-1);
            for(int i=0;i<s.length();i++){
                hash[s.charAt(i)-'a']=i;
                if(hash[0]!= -1 && hash[1]!=-1 && hash[2]!=-1){
                    res += 1+ Math.min(hash[0], Math.min(hash[1], hash[2]));
                }
            }
        return res;
    }
}