// class Solution {
//     public int numSteps(String s) {
//         int a = 0;
//         int n=0;
//         for(int i= s.length()-1; i>=0;i--){
//             if(s.charAt(i)=='1') n += (s.charAt(i)-'0') * Math.pow(2,a);
//             a++;
//         }
//         // System.out.print(n);
//         a=0;
//         while(n!=1){
//             if(n%2==0){
//                 n= n/2;
//             }
//             else{
//                 n++;
//             }
//             a++;
//         }
//         return a;
//     }
// }


public class Solution {

    public int numSteps(String s) {
        int N = s.length();

        int operations = 0;
        int carry = 0;
        for (int i = N - 1; i > 0; i--) {
            int digit = Character.getNumericValue(s.charAt(i)) + carry;

            if (digit % 2 == 1) {
                operations += 2;
                carry = 1;
            } else {
                operations++;
            }
        }

        return operations + carry;
    }
}