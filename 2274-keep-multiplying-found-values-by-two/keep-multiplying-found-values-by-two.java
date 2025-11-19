class Solution {
    public int findFinalValue(int[] nums, int original) {
        for(int i=0;i<nums.length;i++){
            if(original == nums[i]){
                original*=2;
                i=-1;
                continue;
            } 
        }
        return original;
    }
}