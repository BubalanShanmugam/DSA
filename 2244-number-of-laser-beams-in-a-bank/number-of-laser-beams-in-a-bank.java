class Solution {
    public int numberOfBeams(String[] bank) {
       
        int past =0;
        int beam =0;
        for(int i=0;i<bank.length;i++){
            int count=0;
        
            for(char c : bank[i].toCharArray()){
                if(c=='1') count++;
            }
            if(count > 0){
                beam += (past * count);
                past = count;
            }
        }
        return beam;
    }
}