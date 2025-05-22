// class Solution {

//     // Function to return length of longest subsequence of consecutive integers.
//     public int longestConsecutive(int[] arr) {
//         // code here
//         Arrays.sort(arr);
        
//         HashSet<Integer> set = new HashSet<>();
        
//         for(int i : arr){
//             set.add(i);
//         }
        
//         int count =0;
//         int element;
//         int max =0;
        
//         for(int i : set){
//             if(! set.contains(i-1)){
//                 element =i;
//                 count=1;
//                 while(set.contains(i+1)){
//                     element++;
//                     count++;
//                 }
//                 count = Math.max(max, count);
//             }
//         }
        
//         return count;
//     }
// }




class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
         Set<Integer> set= new TreeSet<>();
         int n=arr.length;
         for(int i=0; i<n; i++){
             set.add(arr[i]);
         }
         
         int count=1;
         int maxCount=1;
         for(Integer num:set){
             if(set.contains(num+1)){
                 count++;
             }else{
                 maxCount=Math.max(maxCount, count);
                 count=1;
             }
             
         }
         
         return maxCount;
         
    }
}