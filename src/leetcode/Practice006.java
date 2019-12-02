package leetcode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 题目描述：迭代法实现二叉树的后序遍历
 */
public class Practice006 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    //要保证根结点在左右孩子访问之后才能访问，则需要用到栈，对于任一结点P，先将其入栈
    //如果P不存在左右孩子，则可以直接访问；
    //如果P有孩子且孩子都已经被访问，则可以访问P；
    //如果P有孩子且孩子没有被访问，则将P的右孩子和左孩子依次入栈，这样就可以保证左孩子在右孩子之前被访问，左右孩子在根结点之前被访问。
    public ArrayList<Integer> postOrderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        stack.push(root);
        while (!stack.empty()) {
            TreeNode cur = stack.peek();
            if ((cur.left == null && cur.right == null) || (pre != null && (pre == cur.left || pre == cur.right))) {
                list.add(cur.val);
                stack.pop();
                pre = cur;
            } else {
                if (cur.right != null) {
                    stack.push(cur.right);
                }
                if (cur.left != null) {
                    stack.push(cur.left);
                }
            }
        }

        return list;
    }
}
