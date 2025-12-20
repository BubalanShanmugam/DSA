class Solution {
    public int minDeletionSize(String[] strs) {
        int count =0;
        int n = strs.length;

        // for(int i=0;i<n-1;i++){
        //     // for(int j = i+1;j<n;j++){
        //         for(int k=0;k< strs[0].length();k++){
        //             if( strs[i].charAt(k) > strs[i+1].charAt(k)){
        //                 count++;
        //                 break;
        //             }
        //         }
        //     // }
        // }

        for (int k = 0; k < strs[0].length(); k++) { 
            for (int i = 0; i < n-1; i++) { 
                if (strs[i].charAt(k) > strs[i+1].charAt(k)) {
                    count++;
                    break; 
                }
            }
        }
        return count;
    }
}