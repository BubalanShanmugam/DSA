// class Solution {
//     public int countCollisions(String d) {
//         int count = 0;

//         for(int i=0;i<d.length()-1;i++){
//             if(i>0 && ((d.charAt(i)=='R' && d.charAt(i-1)=='R') ||  
//             (d.charAt(i)=='L' && d.charAt(i-1)=='L'))) count ++;
//             else if(d.charAt(i)=='S' || d.charAt(i+1)=='S') count++;
//             else if(d.charAt(i)=='R' && d.charAt(i+1)=='L') count = count + 2;
//             else continue;
//         }
//         return count;
//     }
// }











class Solution {

    public int countCollisions(String directions) {
        int n = directions.length();
        int l = 0;
        int r = n - 1;

        while (l < n && directions.charAt(l) == 'L') {
            l++;
        }

        while (r >= l && directions.charAt(r) == 'R') {
            r--;
        }

        int res = 0;
        for (int i = l; i <= r; i++) {
            if (directions.charAt(i) != 'S') {
                res++;
            }
        }
        return res;
    }
}