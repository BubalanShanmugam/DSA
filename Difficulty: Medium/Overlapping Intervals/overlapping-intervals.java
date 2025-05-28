class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        // Code here // Code here
        
        Arrays.sort(arr, (a,b) -> Integer.compare(a[0],b[0]));
        
        List<int[]> list = new ArrayList<>();
        
        for(int i =0; i< arr.length;i++){
            if(list.isEmpty() || arr[i][0]> list.get(list.size()-1)[1]){
                list.add(new int[]{arr[i][0], arr[i][1]});
            }
            else{
                list.get(list.size()-1)[1]= Math.max(list.get(list.size()-1)[1], arr[i][1]);
            }
        }
        
        return list;
    }
}