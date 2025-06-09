
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        // if(a.length > b.length) return false;
        // Arrays.sort(a);
        // Arrays.sort(b);
        // int i=0;
        // int j =0;
        // while(i<a.length && j< b.length){
        //     if(a[i]==b[j]){
        //         i++;
        //         j++;
        //     }
        //     else{
        //         i++;
        //     }
        // }
        // if(i>a.length) return false;
        // return true;
        
        // List<Integer> list1 = new ArrayList<>();
        // list1 = Arrays.stream(a).boxed().collect(Collectors.toList());
        // for(int i : b){
        //     if(!list1.contains(i)){
        //         return false;
        //     }
        //     if(list1.contains(i)){
        //         list.remove(i)
        //     }
        // }
        
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        
        for(int i : a){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        
        for(int i : b){
            if(!map.containsKey(i) || map.get(i)==0){
                return false;
            }else{
                map.put(i, map.get(i)-1);
            }
        }
        return true;
    }
}
