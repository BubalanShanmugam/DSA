class Solution {
    public int countBinarySubstrings(String s) {
        int  i=0, j=0, max =0, jc =1;
        ArrayList<Integer> list = new ArrayList<>();
            while(j<s.length()){
                jc=0;
                for(i=j;i<s.length();i++){
                    if(s.charAt(i) == s.charAt(j)){
                       jc++; 
                    } 
                    else{
                        break;           
                    }
                }
                j=i;
                list.add(jc);
            }
            for(int z=0;z<list.size()-1;z++){
                max += Math.min(list.get(z), list.get(z+1));
            }
            return max;
        }
    }
