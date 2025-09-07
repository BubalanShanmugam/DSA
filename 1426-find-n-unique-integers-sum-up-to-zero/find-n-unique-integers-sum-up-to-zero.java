class Solution {
    public int[] sumZero(int n) {
        int [] arr = new int[n];
        int m= n/2;
        int index =0;
        if(n%2==1){
            for(int i=m;i>0;i--){
                arr[index++] = i;
                arr[index++] =-i;
            }
            arr[index]=0;
            return arr;
        }
        else{
            for(int i=m;i>0;i--){
                arr[index++] = i;
                arr[index++] =-i;
            }
            return arr;
        }
    }
}