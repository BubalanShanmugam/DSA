class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        int left =0;
        int top =0;
        int right = matrix[0].length-1;
        int bottum = matrix.length-1;
    while(top<= bottum && left <= right){


        for(int i = left ;  i<= right ; i++){
            list.add(matrix[top][i]);
        }
        top++;

        for(int i = top ;  i<= bottum ; i++){
            list.add(matrix[i][right]);
        }
        right--;
           if(top<=bottum)
           {
        for(int i = right ;  i>= left ; i--){
            list.add(matrix[bottum][i]);
        }
        bottum--;
           }
           if(left<=right)
           {
        for(int i = bottum ;  i>= top ; i--){
            list.add(matrix[i][left]);
        }
        left++;
           }

    }
        return list;
    }
}