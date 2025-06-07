class Solution {
    // Function to remove duplicates from the given array
    public int removeDuplicates(int[] arr) {
        // Code Here
        int j =1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[j]=arr[i];
                j++;
            }
        }
        return j;
    }
}