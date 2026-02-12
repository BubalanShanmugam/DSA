class Solution {
    public int longestBalanced(String s) {
        int max =0;

        HashMap<Character, Integer> map = new HashMap<>();

        int n = s.length();
        for(int i=0;i<n;i++){
            for(int j = i ; j < n ; j++){
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0)+1);
                int z = map.get(s.charAt(j));
                int count =0;
                for( char c : map.keySet()){
                    if(map.get(c) != z){
                        break;
                    }
                    count++;
                }

                if(count == map.size() && max < j-i+1){
                    max = j-i+1;
                }
            }
            map.clear();
        }
        return max;
    }
}

// class Solution {
//     public int longestBalanced(String s) {
//         int max = 0;
//         int n = s.length();
        
//         for(int i = 0; i < n; i++){
//             int freq[] = new int[26];
            
//             for(int j = i; j < n; j++){
//                 char ch = s.charAt(j);
//                 freq[ch - 'a']++;
                
//                 if(issamefreq(freq)){
//                     max = Math.max(max, j - i + 1);
//                 }
//             }
//         }
//         return max;
//     }
    
//     public static boolean issamefreq(int arr[]){
//         int value = 0;
        
//         for(int a : arr){
//             if(a == 0) continue;
            
//             if(value == 0) 
//                 value = a;
//             else if(value != a) 
//                 return false;
//         }
//         return true;
//     }
// }