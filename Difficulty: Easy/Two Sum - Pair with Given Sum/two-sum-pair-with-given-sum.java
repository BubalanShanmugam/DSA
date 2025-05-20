// User function Template for Java

class Solution {
    boolean twoSum(int nums[], int target) {
        // code here
        // int [] result = new int[2];
        
        // for(int i =0;i<nums.length;i++){
        //     for(int j =i+1;j< nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //             // result[0]=i;
        //             // result[1]=j;
        //             // return result;
        //             return true;
        //         }
        //     }
        // }
        // return false;
        
        
        Arrays.sort(nums);
        int j =nums.length-1;
        int i=0;
        while(i<j){
            
            if(nums[i]+nums[j]==target){
                return true;
            }
            
            else if(nums[i]+nums[j]> target){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
}