
class Solution {
    public static ArrayList<ArrayList<Integer>> triplets(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        for(int i =0; i< arr.length;i++){
            if(i>0 && arr[i]== arr[i-1]) continue;
            
            int j = i+1;
            int k = arr.length-1;
            
            while(j<k){
                int sum = arr[i]+arr[j]+arr[k];
                if(sum > 0){
                    k--;
                }
                else if(sum < 0){
                    j++;
                }
                else{
                    ArrayList<Integer> list = new ArrayList<>();
                    
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(arr[k]);
                    
                    result.add(list);
                
                    k--;
                    j++;
                    
                    while(j< k && arr[j]==arr[j-1]) j++;
                    while(j<k && arr[k]==arr[k+1]) k--;
                }
            }
        }
        return result;
    }
}
