// User function Template for Java

class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        long n = arr.length;
        long sn = (n*(n+1))/2;
        long s2n = (n*(n+1)*(2*n+1))/6;
        long s=0;
        long s2=0;
        for(int i =0; i< arr.length;i++){
            s+=arr[i];
            s2+= (long)arr[i]*(long)arr[i];
        }
        
        long value1= s-sn;
        long value2= s2-s2n;
        
        value2= value2/value1;
        long x= (value1+value2)/2;
        long y = x-value1;
        
        list.add((int) x);
        list.add((int) y);
        return list;
        
    }
}
