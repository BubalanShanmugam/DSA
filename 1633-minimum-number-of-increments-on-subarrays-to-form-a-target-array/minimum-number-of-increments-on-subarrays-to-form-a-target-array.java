class Solution {
    public int minNumberOperations(int[] target) {
        int count = target[target.length-1];
        for(int i= target.length-1;i>=0;i--){
            
            for(int j = i-1;j>=0;j--){
                if(target[i] < target[j]) {
                     count += target[j]-target[i];
                    i=j+1;
                    break;
                }
                else {
                   break;
                }
            
            }
        }

        return count;

        // int count = target[0];
        // for(int i=1;i<target.length;i++){
        //     count += Math.max(target[i]-target[i-1],0);
        // }

        // return count;
    }
}