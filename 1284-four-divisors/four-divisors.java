class Solution {
    public int sumFourDivisors(int[] nums) {
        int result =0;
        int count =0;
        int total =0;

        for(int n : nums){
            count =0;
            total =0;
            for(int i = 1; i <= Math.sqrt(n); i++){
                if(n%i ==0){
                    count++;
                    total += i;
                    if(n/i != i) {
                        count++;
                        total += n/i;
                    }
                }
            }
            if(count==4){
                result += total;
            } 
        }
        return result;
    }
}