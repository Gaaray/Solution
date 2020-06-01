package leetcode;

public class solution_1022{
    public static void main(String[] args) {

    }
    public int sumRootToLeaf(TreeNode root) {
        //相当于由跟找到子节点
        return fun(root,0);

    }

    public int fun  (TreeNode root,int val ){
        if(root ==null) return 0;
        val = 2*val+ root.val;
        if(root.right==root.left)  return val;
        return fun(root.right,val) +fun(root.left,val) ;
    }
}
