class Solution {
    public char nextGreatestLetter(char[] ls, char target) {
    //     char min = (char) 65535;
    //     for(char c : letters){
    //         if(target < c && min > c){
    //             min =c;
    //         }
    //     }
    //     return min=='z'? letters[0]: min;
    int l =0;
    int r = ls.length;
    int res = r;
    int mid = -1;
    if(target >= ls[ls.length-1]){
        r=0;
    }
    while(l<r){
        mid = l+(r-l)/2;
        if(ls[mid]>target){
            res = mid;
            r=mid;
        }else{
            l= mid+1;
        } 
  
    }
    return ls[l];
    }
}



// char res = letters[0];
//         boolean flag = false;

//         for(char ch : letters){
//             if(!flag){
//                 if(ch > target){
//                     res = ch;
//                     flag = !flag;
//                 }
//             } else {
//                 if(ch > target && ch < res)res = ch;
//             }
//         }

//         return res;