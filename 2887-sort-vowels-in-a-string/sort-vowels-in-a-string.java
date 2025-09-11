class Solution {
    public String sortVowels(String s) {
        PriorityQueue<Character> pq = new PriorityQueue<>();
        char [] ch =  s.toCharArray();
        for(char c :ch){
            if(c=='a' || c=='e'||c=='i' || c=='o'||c=='u' || c=='A'||c=='E' || c=='I'||c=='O' ||c=='U'){
                pq.add(c);
            }
        }

        for(int i=0;i<s.length();i++){
            if(ch[i]=='a'||ch[i]=='i'||ch[i]=='e'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
                ch[i]=pq.poll();
            }
        }

        return String.valueOf(ch);
    }
}