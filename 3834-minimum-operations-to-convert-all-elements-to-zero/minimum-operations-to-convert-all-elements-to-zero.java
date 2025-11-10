class Solution {
    public int minOperations(int[] nums) {
        int count =0;

        Stack<Integer> s = new Stack<>();

        for(int i : nums ){


            while(!s.isEmpty() && s.peek()>i){
                s.pop();
            }
            if(i==0) continue;
            if(s.isEmpty() || s.peek()<i){
                count++;
                s.add(i);
            }
        }
        return count;

    }
}