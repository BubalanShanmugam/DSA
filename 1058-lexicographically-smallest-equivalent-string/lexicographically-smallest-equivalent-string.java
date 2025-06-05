class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        int [] parent = new int[26];
        for(int i=0; i<26;i++){
            parent[i]=i;
        }

        for(int i=0; i< s1.length();i++){
            int a = s1.charAt(i) -'a';
            int b = s2.charAt(i) -'a';

            int par1 = findPar(parent,a);
            int par2 = findPar(parent, b);

            // if(par1<par2){
            //     parent[par2]=[par1];
            // }
            // else{
            //     parent[par1]=[par2];
            // }

            // or

            if(par1 != par2) parent[Math.max(par1, par2)] = Math.min(par1, par2);
        }
        StringBuilder sb = new StringBuilder();
        for(char c : baseStr.toCharArray()){
            sb.append((char) (findPar(parent, c-'a')+ 'a'));
        }

        return sb.toString();
    }

        private int findPar(int[] parent, int x){
            while(parent[x] != x){
                parent[x]=parent[parent[x]];
                x=parent[x];
            }
            return x;
        }
}