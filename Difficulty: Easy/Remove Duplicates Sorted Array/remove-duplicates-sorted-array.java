class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> a= new ArrayList<Integer>();
        a.add(arr[0]);
        for(int i=1;i< arr.length;i++){
            if(arr[i]!=arr[i-1]) a.add(arr[i]);
        }
        return a;
    }
}
