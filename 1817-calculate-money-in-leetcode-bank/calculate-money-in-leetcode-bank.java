class Solution {
    public int totalMoney(int n) {
        int res =0;
        int add =1;
        int a =add;
        for(int i=1;i<=n;i++){

            res = res+a;
            a++;

            if(i%7 == 0) {
                a = ++add;
            }
        }
        return res;
    }
}