// class Solution {
//     public String longestSubsequenceRepeatedK(String s, int k) {
//         // int [] hash = new int[26];

//         // for(char c : s.tocharArray()){
//         //     if(hash[c-'a']==0)
//         //         hash[c -'a']++;
//         //     else
//         //         hash[c-'a']--;    
//         // }

//         HashMap<Character, Integer> map = new HashMap<>();

//         for(int i=0;i<s.length();i++){
//             if(map.isEmpty()||map.getOrDefault(s.charAt(i),0) == 0){
//                 map.put(s.charAt(i),1);
//             }
//             else{
//                 map.put(s.charAt(i) , map.get(s.charAt(i))+1);
//             }
//         }
//         boolean b = true;
//         char [] chars = new char[s.length()];

//         int z=0;
//         for(var i : map.keySet()){
//             if(map.get(i)>=k){
//                 b=false;
               
//                 chars[z++]=(char) i;
//             }
//         }

//         if(b) return "";
//         char [] c = Arrays.copyOfRange(chars, 0, z);
//         // Arrays.sort(c);

//         // String str = new String();
//         StringBuilder sb = new StringBuilder();
//         for(char x : c){
//             sb.append(x);
//         }
//         return sb.toString();

//     }
// }

class Solution {
    public String longestSubsequenceRepeatedK(String s, int k) {
    String ans = "";
    Queue<String> q = new LinkedList<>();
    q.add("");

    while(!q.isEmpty())
    {
      String str = q.poll();  
      for(char ch = 'a'; ch<='z'; ch++)
      {
        String temp = str + ch; 
        if(isKTimesRepeated(temp, s, k))
        {
        ans = temp;
        q.add(temp);
        }
      }
    }
    return ans;
    }

    public boolean isKTimesRepeated(String temp, String src, int k)
    {
      int p = 0 , counter = 0; 
      for(char ch : src.toCharArray())
      {
        if(ch==temp.charAt(p))
        {
          if(++p==temp.length())
          {
          p = 0; 
          if(++counter==k)
          return true;  
          } 
        }  
      }
       return false;
    }
}