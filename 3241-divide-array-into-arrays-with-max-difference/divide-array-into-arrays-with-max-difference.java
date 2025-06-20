class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int[][] res = new int[nums.length][3];
        int j =0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=3){
            if(nums[i+2]-nums[i]>k){
                return new int[0][0];
            }
            res[j][0]=nums[i];
            res[j][1]=nums[i+1];
            res[j][2]=nums[i+2];
            j++;
        }
        return Arrays.copyOfRange(res,0,j);
    }
}