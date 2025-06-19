class Solution {
    public boolean isIsomorphic(String s, String t) {
        int m1[] = new int[256];
        int m2[] = new int[256];
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            if (m1[s.charAt(i)] != m2[t.charAt(i)]) return false;
            m1[s.charAt(i)] = i + 1;
            m2[t.charAt(i)] = i + 1;
        }
        return true;
    }
    //     if(s.length() != t.length()) return false;

    //     HashSet<String> set1 = new HashSet<>();
    //     HashSet<String> set2 = new HashSet<>();

    //     for(int i=0; i<s.length();i++){
    //         set1.add(s.charAt(i)+"");
    //         set2.add(t.charAt(i)+"");
    //     }

    //     return set1.size()==set2.size();
    // }
}