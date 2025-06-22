class Solution {
    public String[] divideString(String s, int k, char fill) {
        String [] result = new String[s.length()];
        int j =0;
        for(int i=0;i<s.length();i=i+k){
            StringBuilder sb;
            if(i<=s.length()-k)
            {
                sb = new StringBuilder(s.substring(i,i+k));
                result[j]= sb.toString();
                j++;
            }
            else{
                sb = new StringBuilder(s.substring(i,s.length()));
                while(sb.length()<k){
                    sb.append(fill+"");
                }
                result[j]= sb.toString();
                j++;
            }
            
        }
        return Arrays.copyOfRange(result, 0,j);
    }
}