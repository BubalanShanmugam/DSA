class Solution {
    public int candy(int[] ratings) {
        int sum =0;
        int [] left = new int[ratings.length];
        left[0]=1;
        for(int i=1;i<ratings.length;i++){
            
            if(ratings[i]>ratings[i-1]){
                left[i]= left[i-1]+1;
            }else{
                left [i]=1;
            }
        }
        int right =1;
        sum += Math.max(1, left[ratings.length-1]);
        int curr = 1;
        for(int i=ratings.length-2;i>=0;i--){
            
            if(ratings[i]>ratings[i+1]){
                curr=right+1;
                right = curr;
            }else{
                right=1;
            }
            sum+= Math.max(left[i], right);
        }


        // for(int i=0;i<left.length;i++){
        //     sum += left[i];
        // }

        return sum;
    }
}