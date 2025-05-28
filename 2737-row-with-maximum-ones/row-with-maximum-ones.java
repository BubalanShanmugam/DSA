class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max=0;
        
        // int idx =0;
        // boolean bool = false
        // for(int i =0; i< mat.length;i++){
        //     int[] matrix = mat[i];
        //     for(int index =0; index< i.length; index++){
        //         if(matrix[index]==1){
        //             count++;
                    
        //             maxcount= Math.max(maxcount, count);
        //             if(count==maxcount && idx == Math.min(idx, i)){

        //             }
        //             bool = true;
        //         }

        //         if(bool || count==maxcount && i==idx ){

        //         }
        //     }
        // }
        int[] result = {0,0};
        for (int i = 0; i < mat.length; i++){            
            int count=0;
            for(int index =0; index< mat[i].length;index++){
                    count+=mat[i][index];
            }
            
            if (count > result[1]){
                result[0] = i;
                result[1] = count;
            }
        }
        return result;
    }
}