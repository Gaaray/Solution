package leetcode;

public class solution_101 {
    public static void main(String[] args) {


    }
    public static boolean isSymmetric(TreeNode root) {
        if(  root.right==null&&root.left==null)  return true;
        if(root.right!=null&&root.left!=null){
            if(root.right.val==root.left.val){
                return fun(root.right,root.left);
            }
        }
        return false; }
    // 判断两个二叉树是不是对称的
    public static boolean fun(TreeNode root1,TreeNode root2){
        if(root1.right==null&&root1.left==null&&root2.right==null&&root2.left==null)  return true;
        if(root1.val == root2.val){
            return (fun(root1.left,root2.right)&&fun(root1.right,root2.left));
        }else{return false;}



    }

}
