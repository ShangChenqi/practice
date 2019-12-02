package niukeOffer;

import java.util.ArrayList;

/**
 * ��Ŀ�������������´�ӡ����������ÿ���ڵ㣬ͬ��ڵ�������Ҵ�ӡ��
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

	// ʹ��ArrayList��ģ��һ������
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
