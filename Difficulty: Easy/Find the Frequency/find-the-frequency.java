import java.util.stream.*;

class Solution {
    int findFrequency(int arr[], int x) {
        // code here
        // List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        // return Collections.frequency(list, x);
        
        int count =0;
        for(int i=0; i< arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }
}