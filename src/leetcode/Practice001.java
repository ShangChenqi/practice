package leetcode;

/**
 * 题目描述：求给定二叉树的最小深度。最小深度是指树的根结点到最近叶子结点的最短路径上结点的数量。
 */
public class Practice001 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int run(TreeNode root) {
        if (root == null) {
            return 0;
        }

        //如果左子树为空，返回右子树的高度
        if (root.left == null) {
            return run(root.right) + 1;
        }

        //如果右子树为空，返回左子树的高度
        if (root.right == null) {
            return run(root.left) + 1;
        }

        //若左右子树都不为空
        int leftDepth = run(root.left);
        int rightDepth = run(root.right);

        return Math.min(leftDepth, rightDepth) + 1;
    }
}
