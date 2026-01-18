/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
// class Solution {
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> list = new ArrayList<>();

//         inorder(root, list);

//         return list;
//     }

//     static void inorder(TreeNode root, List<Integer> list){
//         if(root !=null){
//             inorder(root.left, list);
//             list.add(root.val);
//             inorder(root.right, list);
//         }
//     }
// }


class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();

        TreeNode n = root;

        while(true){
            if(n!=null){
                st.push(n);
                n=n.left;
            }
            else{
                if(st.isEmpty()) break;

                n = st.pop();
                list.add(n.val);
                n=n.right;
            }
        }
        return list;
    }

  
}