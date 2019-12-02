package niukeOffer;

/**
 * ��Ŀ���������������Ķ�����������任ΪԴ�������ľ���
 * 
 * @author Shang
 *
 */
public class Practice18 {

	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}

	}

	// ǰ�����
	public void Mirror(TreeNode root) {

		if (root == null) {
			return;
		}

		if (root.left == null && root.right == null) {
			return;
		}

		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;

		if (root.left != null) {
			Mirror(root.left);
		}
		if (root.right != null) {
			Mirror(root.right);
		}

	}
}
