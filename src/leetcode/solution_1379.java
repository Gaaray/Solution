package leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class solution_1379 {

//    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
//            if(original  == null) return  null;
//      if(original ==target) return  cloned;
//
//            //  遍历左子树
//        TreeNode   res =  getTargetCopy(original.left,cloned.left,target);
//        if( res != null){
//            return  res;
//        }
//        res =  getTargetCopy(original.right,cloned.right,target);
//        if( res != null){
//            return  res;
//        }
//        return  null;
//    }
//前序非递归
    //使用栈来实现

//       public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
//     Deque<TreeNode> stack  =  new LinkedList<>();
//     Deque<TreeNode> clonestack =  new LinkedList<>();
//     TreeNode node = original ;
//     TreeNode clone = cloned;
//     while(!stack.isEmpty()||node!=null){
//        if(node!=null){
//         if(node ==target)  return clone;
//             stack.push(node);
//             clonestack.push(clone);
//          node = node.left;
//          clone = clone.left;
//         }else {
//           node = stack.pop().right;
//           clone = clonestack.pop().right;
//         }

//     }
//         return clone;
// }
//    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
//    Deque<TreeNode> stack  =  new LinkedList<>();
//    Deque<TreeNode> clonestack =  new LinkedList<>();
//    TreeNode node = original ;
//    TreeNode clone = cloned;
//    stack.push(node);
//    clonestack.push(clone);
//
//    while(!stack.isEmpty()){
//        node = stack .pop();
//        clone = clonestack.pop();
//        if(node ==target) return clone;
//        if(node.right!=null) {
//            stack.push(node.right);
//            clonestack.push(clone.right);
//        }
//        if (node.left!=null) {
//            stack.push(node.left);
//
//        }  clonestack.push(clone.left);
//    }
//
//    return  null;
//}

}

 class TreeNode {
     int val;
    TreeNode left;
    TreeNode right;
     TreeNode(int x) { val = x; }
 }
