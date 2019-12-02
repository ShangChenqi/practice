package niukeOffer;

import java.util.ArrayList;

/**
 * 题目描述：输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)
 */
public class Practice24 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    //一条路径
    ArrayList<Integer> path = new ArrayList<Integer>();

    //所有路径
    ArrayList<ArrayList<Integer>> paths = new ArrayList<ArrayList<Integer>>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null)
            return paths;
        //当前结点添加到路径中
        path.add(root.val);
        //目标值减少
        target -= root.val;
        //当前节点为叶子结点且已达到目标值
        if (target == 0 && root.left == null && root.right == null) {
            //这里要创建一个新的ArrayList
            paths.add(new ArrayList<Integer>(path));
        }
        FindPath(root.left, target);
        FindPath(root.right, target);
        //去除末尾元素
        path.remove(path.size() - 1);

        return paths;
    }
}
