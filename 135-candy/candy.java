class Solution {
    public int candy(int[] r) {
        int sum =1;
        int n = r.length;
        int i =1;

        while(i<n){
            if(r[i]==r[i-1]){
                sum+=1;
                i++;
                continue;
            }

            int peak =1;
            while(i<n && r[i-1]<r[i]){
                i++;
                peak +=1;
                sum+=peak;
            }

            int down =1;

             while(i<n && r[i-1]>r[i]){
                i++;
                sum+=down;
                down +=1;
                
            }
            if(down > peak) sum = sum + (down-peak);
        }
        return sum;
    }
}