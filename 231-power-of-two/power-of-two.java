class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1 ){
            return true;
        }
        else if( n==0){
            return false;
        }

        return n%2==0 && isPowerOfTwo(n/2);

    }
}

// class Solution {
//     public boolean isPowerOfTwo(int n) {

//         return myown(n, 0)?true:false;
//     }

//     public static boolean myown(int n , int i){
//         int count = (int) Math.pow(2, i);
//         if(n==0 || count>n) {
//             return false;
//         }
//         if(count ==n){
//             return true;
//         }

//         return myown(n, i+1);
//     }
// }

