class Solution {
    public String truncateSentence(String s, int k) {
        String [] sarr = s.split(" ");
        String result = "";
        for(int i=0;i< k;i++){
                result = result+sarr[i];
                if(i!=k-1){
                    result=result+" ";
                }
        }
        return result;
    }
}