class Solution {
    public int minNumberOperations(int[] target) {
        // int count=0;
        // Arrays.sort(target);
        // for(int i= target.length-1;i>=0;i--){
        //     for(int j=i-1;j>=0;j--){
        //         if(target[i]==target[j]) j--;
        //         else {
        //             count += target[i]-target[j];
        //             i=j;
        //         }
        //     }
        // }

        // return count;

        int count = target[0];
        for(int i=1;i<target.length;i++){
            count += Math.max(target[i]-target[i-1],0);
        }

        return count;
    }
}