// User function Template for Java

class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int i =0;
        int j =0;
        int value =-1;
        int count=1;
        
        while(value==-1 && i<a.length && j<b.length){
            if(a[i] <= b[j]){
                if(count == k) value = a[i];
                count++;
                i++;
            }
            else{
                if(count == k) value = b[j];
                count++;
                j++;
            }
        }
        while(value==-1 && i<a.length){
            if(count == k) value = a[i];
            count++;
            i++;
        }
        while(value==-1 && j< b.length){
            if(count == k) value = b[j];
            count++;
            j++;
        }
        return value;
    }
}