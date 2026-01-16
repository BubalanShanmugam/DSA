class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        int [] c1 = new int[256];
        int [] c2 = new int[256];
        
        for(int i=0;i<s.length();i++){
            if(c1[s.charAt(i)] == c2[t.charAt(i)]){
                c1[s.charAt(i)]= i+1;
                c2[t.charAt(i)]=i+1;
            }
            else{
                return false;
            }
        }
        return true;
    }
}

