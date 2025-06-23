// class Solution {
//     public long kMirror(int k, int n) {
//         // int i =1;
//         // int count = 0;
//         // int digits=0;
//         // int sum =0;
//         // while(count < n){
//         //     digits = (i == 0) ? 1 : (int) Math.floor(Math.log10(Math.abs(i))) + 1;
//         //     if(digits <=k){
//         //         String s = Integer.toBinaryString(i);
//         //         StringBuilder sb = new StringBuilder(s);
//         //         String rev = sb.reverse().toString();
//         //         if(s.equals(rev)) sum = sum + i;
//         //         i++;
//         //         count++;
//         //     }
//         // }
//         // return sum;
//     }
// }

    class Solution {

    long createPalindrome(long num, boolean odd) {
        long x = num;
        if (odd) x /= 10;
        while (x > 0) {
            num = num * 10 + x % 10;
            x /= 10;
        }
        return num;
    }

    boolean isPalindrome(long num, int base) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append((char) (num % base + '0'));
            num /= base;
        }
        String s = sb.toString();
        int i = 0, j = s.length() - 1;
        while (i < j) if (s.charAt(i++) != s.charAt(j--)) return false;
        return true;
    }

    public long kMirror(int k, int n) {
        long sum = 0;
        for (long len = 1; n > 0; len *= 10) {
            for (long i = len; n > 0 && i < len * 10; i++) {
                long p = createPalindrome(i, true);
                if (isPalindrome(p, k)) { sum += p; n--; }
            }
            for (long i = len; n > 0 && i < len * 10; i++) {
                long p = createPalindrome(i, false);
                if (isPalindrome(p, k)) { sum += p; n--; }
            }
        }
        return sum;
    }
}