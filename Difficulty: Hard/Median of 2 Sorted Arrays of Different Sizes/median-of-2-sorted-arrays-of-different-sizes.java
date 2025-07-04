// User function Template for Java

class Solution {
    public double medianOf2(int a[], int b[]) {
    //     // Your Code Here
    //     int val1=-1;
    //     int val2=-1;
        
    //     int i=0;
    //     int j=0;
        
    //     int count =0;
        
    //     int index1=(a.length + b.length)/2;
    //     int index2=index1-1;
        
    //     while(i<a.length && j<b.length &&(val1 == -1 || val2==-1)){
            
    //         if(a[i]<b[j]){
    //             if(count==i) val1=a[i];
    //             if(count==j) val2=b[j];
    //             count++;
    //             i++;
    //         }
    //         else{
    //             if(count==i) val1=a[i];
    //             if(count==j) val2=b[j];count++;
    //             j--;
    //         }
    //     }
        
    //     while(i<a.length){
    //         if(count==i) val1=a[i];
    //         if(count==j) val2=b[j];
    //         count++;
    //         i++;
    //     }
    //     while(j<b.length){
    //         if(count==i) val1=a[i];
    //         if(count==j) val2=b[j];
    //         count++;
    //         j++;
    //     }
        
    //     if((a.length + b.length)%2==1) return (double) val1;
    //     else return (double) val2;
    
    
    
    
    
     int n1 = a.length, n2 = b.length;
        //if n1 is bigger swap the arrays:
        if (n1 > n2) return medianOf2(b, a);

        int n = n1 + n2; //total length
        int left = (n1 + n2 + 1) / 2; //length of left half
        //apply binary search:
        int low = 0, high = n1;
        while (low <= high) {
            int mid1 = (low + high) / 2;
            int mid2 = left - mid1;
            //calculate l1, l2, r1 and r2;
            int l1 = (mid1 > 0) ? a[mid1 - 1] : Integer.MIN_VALUE;
            int l2 = (mid2 > 0) ? b[mid2 - 1] : Integer.MIN_VALUE;
            int r1 = (mid1 < n1) ? a[mid1] : Integer.MAX_VALUE;
            int r2 = (mid2 < n2) ? b[mid2] : Integer.MAX_VALUE;

            if (l1 <= r2 && l2 <= r1) {
                if (n % 2 == 1) return Math.max(l1, l2);
                else return ((double) (Math.max(l1, l2) + Math.min(r1, r2))) / 2.0;
            } else if (l1 > r2) high = mid1 - 1;
            else low = mid1 + 1;
        }
        return 0;
    }
}