class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        

        if(start > destination){
            int temp = start;
            start = destination;
            destination=temp;
        }
        int sumbefore=0;
        int sum =0;

        for(int i =start; i< destination;i++){
                sumbefore=sumbefore+distance[i];
        }

        for(int dis: distance){
            sum+=dis;
        }

        return Math.min(sumbefore, sum-sumbefore);
    }
}