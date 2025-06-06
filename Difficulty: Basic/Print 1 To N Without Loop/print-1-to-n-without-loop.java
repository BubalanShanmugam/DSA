class Solution {
    public void printNos(int n) {
        // Code here
       
        int i=1;
        ec(i,n);
    }
    
    public static void ec(int i , int n){
         if(i>n) return;
         
         System.out.print(i+" ");
         ec(i+1,n);
    }
}
