class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        int max =0;
        int element ;
        for(int i : nums){
            set.add(i);
        }

        for(int i : set){
            if(! set.contains(i-1)){
                count =1;
                element=i;
                while(set.contains(element+1)){
                    count++;
                    element++;
                }
                max = Math.max(max, count);
            }
        }
        return  max;
    }
}


// class Solution {

//     // Function to return length of longest subsequence of consecutive integers.
//     public int longestConsecutive(int[] arr) {
//          Set<Integer> set= new TreeSet<>();
//          int n=arr.length;
//          for(int i=0; i<n; i++){
//              set.add(arr[i]);
//          }
         
//          int count=1;
//          int maxCount=1;
//          for(Integer num:set){
//              if(set.contains(num+1)){
//                  count++;
//              }else{
//                  maxCount=Math.max(maxCount, count);
//                  count=1;
//              }
             
//          }
         
//          return maxCount;
         
//     }
// }