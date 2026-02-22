class Solution {
    public int binaryGap(int n) {
        ArrayList< Integer> list = new ArrayList<>();

        while(n>=1){
            list.add(n%2);
            n=n/2;
        }
        int b =0;
        int e =list.size()-1;

        while(b<e){
            int t = list.get(b);
            list.set(b, list.get(e));
            list.set(e, t);
            b++;
            e--;
        }
        // System.out.print(list);
        int r=0;
        int f =-1;
        int res=0;
        while(r< list.size()){
            if(f==-1 && list.get(r)==1) f=r;

            if(f!=r && list.get(r)==1){
                res = Math.max(res, r-f);
                f=r;
            }
            r++;
        }
        return res;
    }
}