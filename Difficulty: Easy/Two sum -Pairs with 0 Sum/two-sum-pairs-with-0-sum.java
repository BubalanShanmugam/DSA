// // User function Template for Java


//   import java.util.stream.Collectors;
// class Solution {
//     public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
//         // code here
       
        
//         // for(int i=0;i<arr.length;i++){
//         //     for(int j =i+1;j<arr.length;j++){
//         //         if(arr[i]+arr[j]==0){
//         //             ArrayList<Integer> list = new ArrayList<Integer>();
//         //             list.add(arr[i]);
//         //             list.add(arr[j]);
//         //             lists.add(list);
//         //         }
//         //     }
//         // }
//         // return lists;
      
//          ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
//         Arrays.sort(arr);
//         int low=0;
//         int high= arr.length -1;
//         while(low<high){
            
//             if(arr[low]+arr[high]==0){
               
//                 ArrayList<Integer> list = new ArrayList<Integer>();
//                 list.add(arr[low]);
//                 list.add(arr[high]);
//                  if(!lists.contains(list)){
//                 lists.add(list);
//                 low++;high--;
//                 }
//                 else{
//                     low++;
//                     high--;
//                 }
//             }
//             else if(arr[low]+arr[high]<0)
//                 low++;
//             else{
//                 high--;
//             }
//         }
                                       
//         return lists;
//     }
// }





class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
        Arrays.sort(arr);
        int l = arr.length;
        ArrayList finalList = new ArrayList();
        int start = 0;
        int end = l-1;
        
        while(start < end){
            int sum = arr[start] + arr[end];
            
            if(sum > 0){
                end--;
            }else if(sum < 0){
                start++;
            }else{
                ArrayList<Integer> list = new ArrayList();
                list.add(arr[start]);
                list.add(arr[end]);
                finalList.add(list);
                while( start < end && arr[start] == arr[start +1]){
                    start++;
                }
                 while(start < end &&arr[end] == arr[end - 1]){
                    end--;
                }
                start++;
                end--;
            }
        }
        
        return finalList;
    }
}