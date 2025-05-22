class GFG {
    static void rotate(int arr[][]) {
        // Code Here
        
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[i].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
            int count=arr[i].length-1;
            int n=0;
            while(n<count){
                int temp=arr[i][n];
                arr[i][n]=arr[i][count];
                arr[i][count]=temp;
                
                count--;
                n++;
            }
        }
    }
}