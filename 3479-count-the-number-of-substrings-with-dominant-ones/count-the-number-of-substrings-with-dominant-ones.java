// class Solution {
//     public int numberOfSubstrings(String s) {
//         int count =0;
//         int one;
//         int zero;
//         for(int i=0;i<s.length();i++){
//             for(int j =i;j<s.length();j++){
//                 one =0;
//                 zero =0;
//                 for(int k=i;k<=j;k++){
//                     if(s.charAt(k)=='1') one++;
//                     else zero++;
//                 }
//                 if(one >= (zero*zero)) count++;
//             }
//         }
//         return count;
//     }
// }


class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int[] pre = new int[n + 1];
        pre[0] = -1;

        for (int i = 0; i < n; i++) {
            if (i == 0 || (i > 0 && s.charAt(i - 1) == '0')) {
                pre[i + 1] = i;
            } else {
                pre[i + 1] = pre[i];
            }
        }
        
        int res = 0;
        for (int i = 1; i <= n; i++) {
            int cnt0 = s.charAt(i - 1) == '0' ? 1 : 0;
            int j = i;
            while (j > 0 && cnt0 * cnt0 <= n) {
                int cnt1 = (i - pre[j]) - cnt0;
                if (cnt0 * cnt0 <= cnt1) {
                    res += Math.min(j - pre[j], cnt1 - cnt0 * cnt0 + 1);
                }
                j = pre[j];
                cnt0++;
            }
        }
        return res;
    }
}