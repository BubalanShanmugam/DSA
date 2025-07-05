class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        int largest =-1;
        
        for(int key : map.keySet()){
            if(key == map.get(key)) largest = key;
        }

        return largest;
    }
}