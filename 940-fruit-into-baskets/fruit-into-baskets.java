// class Solution {
//     public int totalFruit(int[] f) {
//         int i=0;
//         int j=1;
//         boolean b = false;

//         while(i<f.length && j<f.length){
//             int v1 = f[i];
//             int v2 = f[j];
//             while( j<f.length && f[j+1]==v1 || f[j+1]==v2){
//                 b=true;
//                 j++;
//             }
//             if(!b) j++;
//             i++;
//         }
//         return j-i+1;
//     }
// }










class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        if (n <= 2) return n;
        int a = -1, b = -1;
        int lastBCount = 0;
        int currLen = 0, maxLen = 0;
        for (int i = 0; i < n; i++) {
            int fruit = fruits[i];
            if (fruit == a || fruit == b) {
                currLen++;
            } else {
                currLen = lastBCount + 1;
            }
            if (fruit == b) {
                lastBCount++;
            } else {
                a = b;
                b = fruit;
                lastBCount = 1;
            }
            maxLen = Math.max(maxLen, currLen);
        }
        return maxLen;
    }
}