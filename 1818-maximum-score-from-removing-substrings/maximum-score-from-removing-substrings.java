// class Solution {
//     public int maximumGain(String s, int x, int y) {
//         StringBuilder sb = new StringBuilder(s);
//         int point =0;
//         String s1 = x>=y ? "ab" : "ba";
//         String s2 = x>=y ? "ba" : "ab";
//         int max = Math.max(x,y);
//         int min = Math.min(x,y);
//         int index1=sb.indexOf(s1);
        
//         while(index1 != -1)
//         {
//             sb.delete(index1, index1+2);
//             point+=max;
//             index1=sb.indexOf(s1);
//         }

//         index1=sb.indexOf(s2);
//         while(index1!=-1){
//             sb.delete(index1, index1+2);
//             point+=min;
//             index1=sb.indexOf(s2);
//         }
        
//         return point;
//     }
// }



class Solution {
    public int maximumGain(String s, int x, int y) {
        // Always remove the higher value pair first
        if (x > y) {
            return removeGain(s, "ab", x, "ba", y);
        } else {
            return removeGain(s, "ba", y, "ab", x);
        }
    }

    private int removeGain(String s, String firstPair, int firstVal, String secondPair, int secondVal) {
        StringBuilder sb = new StringBuilder();
        int score = 0;

        // First pass: remove all of the first (higher value) pair
        for (char c : s.toCharArray()) {
            int len = sb.length();
            if (len > 0 && sb.charAt(len - 1) == firstPair.charAt(0) && c == firstPair.charAt(1)) {
                sb.deleteCharAt(len - 1);
                score += firstVal;
            } else {
                sb.append(c);
            }
        }

        // Second pass: remove all of the second pair
        StringBuilder finalSb = new StringBuilder();
        for (char c : sb.toString().toCharArray()) {
            int len = finalSb.length();
            if (len > 0 && finalSb.charAt(len - 1) == secondPair.charAt(0) && c == secondPair.charAt(1)) {
                finalSb.deleteCharAt(len - 1);
                score += secondVal;
            } else {
                finalSb.append(c);
            }
        }

        return score;
    }
}

