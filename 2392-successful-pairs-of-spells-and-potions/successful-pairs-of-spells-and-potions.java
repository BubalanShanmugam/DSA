class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] arr = new int[spells.length];

        for(int i=0; i<spells.length;i++){
            // for(int j=0;j<potions.length;j++){
            //     if(((long)spells[i] * (long)potions[j]) >= (long) success){
            //         count++;
            //     }
            // }
            int left =0;
            int right = potions.length-1;
            int index =-1;

            while(left <= right){
                int mid = (left+right)/2;

                if((long) spells[i]*(long) potions[mid] >= success){
                    index = mid;
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
            arr[i]=(index==-1)?0: (potions.length-index);
        }
        return arr;
    }
}