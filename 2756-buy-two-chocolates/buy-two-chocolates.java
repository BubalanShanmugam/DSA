class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);

        int s = prices[0]+prices[1];

        if(money - s < 0){
            return money;
        }
        else{
            return money - s;
        }

        // int sum =0;
        // int count=0;
        // for(int i=0; i<2;i++){
        //     if(money<=sum){
        //         break;
        //     }
        //     sum = sum+prices[i];
        //     count++;
        // }
        // if(count!=2){ return money;}
        // return money - sum;
    }
}