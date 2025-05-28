// User function Template for Java

class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here
        
        // int j = 0;
        // for(int i = a.length-1;i>=0; i--){
        //     if(j<b.length-1 && a[i]> b[j]){
        //         int temp = a[i];
        //         a[i]= b[j];
        //         b[j]=temp;
        //         j++;
        //     }
        //     else{
        //         break;
        //     }
        // }
        // Arrays.sort(a);
        // Arrays.sort(b);
        
        int i =a.length-1;
        int j = 0;
        
        while(i>=0 && j<= b.length-1){
            if(a[i]> b[j]){
                int temp = a[i];
                a[i]=b[j];
                b[j]=temp;
                i--;
                j++;
            }
            else{
                break;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
}