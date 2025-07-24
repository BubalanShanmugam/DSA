class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        Arrays.sort(arr);
        
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==arr[i]) list.add(arr[i]);
        }
        return list;
    }
}