// class Solution {
//     public int alternateDigitSum(int n) {
//         int num=0;
//         int sum =0;
//         int count=0;
//         while(n!=0){
//             num = n%10;
//             if(count%2==1){
//                 sum-= num;
//             }
//             else{
//                 sum+=num;
//             }
//             count++;
//             n=n/10;
//         }
//         return sum;
//     }
// }


class Solution {
    public int alternateDigitSum(int n) { 

     String s = Integer.toString(n);
    int sum = 0;
      for(int i=0;i<s.length();i++) {
        int digit = s.charAt(i) - '0';
         if(i%2==0) 
         sum += digit;
         else
         sum -= digit;
      }
      return sum; 
    }
}