// class Solution {
//     public List<Integer> getRow(int r) {
//         List<Integer> l = new ArrayList<Integer>();

//         int res =1;

//         l.add(res);
//         for(int i=0;i<r;i++){
//             res = res *(r-i);
//             res = res / (i+1);
//             l.add(res);
//         }
//         return l;
//     }
// }


public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        long prev = 1;
        for (int k = 1; k <= rowIndex; k++) {
            long next_val = prev * (rowIndex - k + 1) / k;
            res.add((int) next_val);
            prev = next_val;
        }
        return res;
    }
}

