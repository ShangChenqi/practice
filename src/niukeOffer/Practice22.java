package niukeOffer;

import java.util.ArrayList;

/**
 * 题目描述：从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * 
 * @author Shang
 *
 */
public class Practice22 {

	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;
		}
	}

	// 使用ArrayList来模拟一个队列
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		ArrayList<TreeNode> queue = new ArrayList<TreeNode>();

		if (root == null) {
			return result;
		}

		queue.add(root);

		while (!queue.isEmpty()) {
			TreeNode temp = queue.remove(0);
			result.add(temp.val);
			if (temp.left != null) {
				queue.add(temp.left);
			}
			if (temp.right != null) {
				queue.add(temp.right);
			}
		}

		return result;
	}
}
