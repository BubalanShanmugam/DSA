class Solution {
    public boolean isPalindrome(int x) {
        int reverse = Solution.reverse(x);
        if(x>=0 && reverse == x){
            return true;
        }
        else{
            return false;
        }
    }
    public static int reverse(int x) 
    {
        long reverse =0;
        while(x!=0){
            int num = x%10;
            reverse = reverse*10 + num;
            x = x/10;
        }

        // if(Integer.MAX_VALUE > reverse && Integer.MIN_VALUE < reverse){
        return (int)reverse;
        // }
        // else{
        //     return 0;
        // }
    }
}