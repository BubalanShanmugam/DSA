// class FindSumPairs {
//     int[] a ;
//     int[] b ;

//     public FindSumPairs(int[] nums1, int[] nums2) {
//         this.a = nums1;
//         this.b = nums2;
//     }
    
//     public void add(int index, int val) {
//         b[index]=b[index]+val;
//     }
    
//     public int count(int tot) {
//         int count =0;
//         int i =0;
//         int j =0;
//         while(i < a.length){
//             while(j<b.length){
//                 if((a[i]+b[j++]) ==tot) count++;
//             }
//             j=0;
//             i++;
//         }
//         return count;
//     }
// }



class FindSumPairs {
    int[] a ;
    int[] b ;
    HashMap<Integer, Integer> map;

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.a = nums1;
        this.b = nums2;
        this.map = new HashMap<>();

        for(int i : nums2){
            map.put(i, map.getOrDefault(i,0)+1);
        }
    }
    
    public void add(int index, int val) {
        map.put(b[index],map.get(b[index])-1);
        b[index]=b[index]+val;
        map.put(b[index], map.getOrDefault(b[index],0)+1);
    }
    
    public int count(int tot) {
        int count =0;
        for(int i : a){
            int rem = tot-i;
            count += map.getOrDefault(rem,0);
        }
        return count;
    }
}
/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */