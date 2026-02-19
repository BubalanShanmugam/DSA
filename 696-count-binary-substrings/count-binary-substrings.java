class Solution {
    public int countBinarySubstrings(String s) {
        int  i=0, max =0;
        ArrayList<Integer> list = new ArrayList<>();
        int t =0;
        list.add(1);
        for(i=1;i<s.length();i++){
            if(s.charAt(i-1) != s.charAt(i)){
               list.add(++t,1); 
            }                     
            else{
                list.set(t, list.get(t)+1);
                        
            }
        }
              
        for(int z=0;z<list.size()-1;z++){
               max += Math.min(list.get(z), list.get(z+1));
        }
        return max;        
    }
}
