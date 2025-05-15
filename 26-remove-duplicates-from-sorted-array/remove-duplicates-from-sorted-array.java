class Solution {
    public int removeDuplicates(int[] nums) {
        // HashSet<Integer> set = new HashSet<>();

        // for(int i : nums){
        //     set.add(i);
        // }

        // int i=0;
        // for(int element : set){
        //     nums[i]= element;
        //     i++;
        // }
        // return set.size();

        int j=1;
        for(int i=1;i<nums.length;i++){
           if(nums[i-1]!=nums[i]){
                nums[j]= nums[i];
                j++;
           }
        }
        return j;
    }
}