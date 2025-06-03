class Solution {
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialboxes) {
        boolean foundOpenable = true;
        int totalcandies=0;

        List<Integer> initialBoxes = new ArrayList<>();
        for(int b : initialboxes) initialBoxes.add(b);
        while(!initialBoxes.isEmpty() && foundOpenable){
            foundOpenable=false;
            List<Integer> nextBoxes = new ArrayList<>();
            for(int boxid : initialBoxes){
                if(status[boxid] == 1){
                    foundOpenable=true;

                    for(int nb : containedBoxes[boxid]) nextBoxes.add(nb);

                    for(int keyid : keys[boxid] ) status [keyid]=1;

                    totalcandies +=candies[boxid];
                }
                else{
                    nextBoxes.add(boxid);
                }
            }
            initialBoxes = nextBoxes;
        }
        return totalcandies;
    }
}