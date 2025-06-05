class Solution {
    public static String reverseVowels(String s) {

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i)=='a' || s.charAt(i)=='e'  || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' |s.charAt(i)=='E' ||s.charAt(i)=='I' ||s.charAt(i)=='O' ||s.charAt(i)=='U' ){
                    sb.append(s.charAt(i));
                }
            }

            int n = sb.length()-1;
            String [] c = s.split("");

            for(int i =0; i<s.length();i++){
                if (s.charAt(i)=='a' || s.charAt(i)=='e'  || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' |s.charAt(i)=='E' ||s.charAt(i)=='I' ||s.charAt(i)=='O' ||s.charAt(i)=='U' ){
                    c[i] =String.valueOf(sb.charAt(n));
                    n--;
                }
            }

            String str = String.join("", c);
            return str;
        }
}