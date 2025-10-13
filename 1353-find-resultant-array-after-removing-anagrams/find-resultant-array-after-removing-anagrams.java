class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>();

        list.add(words[0]);
        for(int i=1;i<words.length;i++){
            char[] c1 = words[i-1].toCharArray();
            char[] c2 = words[i].toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            if(Arrays.equals(c1,c2)){
                continue;
            }
            list.add(words[i]);
        }

        return list;
    }
}