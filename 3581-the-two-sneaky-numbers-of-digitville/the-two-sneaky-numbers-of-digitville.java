class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] hash = new int[nums.length];
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            hash[nums[i]]++;
            if(hash[nums[i]]==2) list.add(nums[i]);
        }
      
        int[] arr = new int[list.size()];

        for(int j=0;j<list.size();j++){
            arr[j] = list.get(j);
        }
        return arr;
    }
}