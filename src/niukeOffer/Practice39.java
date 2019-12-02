package niukeOffer;

/**
 * 题目描述：判断一棵树是否为平衡二叉树
 */
public class Practice39 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    //目前使用的方法不是最优解
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (Math.abs(TreeDepth(root.left) - TreeDepth(root.right)) > 1) {
            return false;
        }

        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);

    }

    public int TreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return TreeDepth(root.left) > TreeDepth(root.right) ? TreeDepth(root.left) + 1 : TreeDepth(root.right) + 1;
    }

}
