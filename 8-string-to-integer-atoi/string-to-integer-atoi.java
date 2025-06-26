// class Solution {
//     public int myAtoi(String s) {
//         boolean b = false;
//         s= s.trim();
//         if(s.charAt(0)=='-'){
//             b = true;
//             s=s.substring(1);
//         }

//         if(b){
//             return -(Integer.parseInt(s));
//         }
//         else{
//             return Integer.parseInt(s);
//         }

        
//     }
// }

class Solution {
    public int myAtoi(String s) {
        int INT_MAX = 2147483647, INT_MIN = -2147483648;
        int i = 0, n = s.length(), result = 0;
        boolean sign =false;
        
        // Step 1: Skip leading whitespace
        while (i < n && s.charAt(i) == ' ') i++;
        
        // Step 2: Check for optional sign
        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = s.charAt(i) == '-';
            i++;
        }
        
        // Step 3: Convert digits to integer
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            // Check for overflow
            if (result > (INT_MAX - digit) / 10) {
                return !sign ? INT_MAX : INT_MIN;
            }
            result = result * 10 + digit;
            i++;
        }
        return sign ? -result:result;
    }
}