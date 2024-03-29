package niukeOffer;

/**
 * ��Ŀ�������������ö�����A��B���ж�B�ǲ���A���ӽṹ����ps������Լ��������������һ�������ӽṹ��
 * 
 * @author Shang
 *
 */
public class Practice17 {
	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;
		}
	}

	// ������
	// ��һ������A�����ҵ�B���ĸ����
	// �ڶ������ж�B���Ƿ�ΪA��������
	public boolean HasSubtree(TreeNode root1, TreeNode root2) {
		boolean result = false;

		if (root1 != null && root2 != null) {
			if (root1.val == root2.val) {
				result = DoesTree1HasTree2(root1, root2);
			}
			if (!result) {
				result = HasSubtree(root1.left, root2);
			}
			if (!result) {
				result = HasSubtree(root1.right, root2);
			}
		}

		return result;
	}

	private boolean DoesTree1HasTree2(TreeNode root1, TreeNode root2) {

		if (root2 == null) {
			return true;
		}

		if (root1 == null) {
			return false;
		}

		if (root1.val != root2.val) {
			return false;
		}

		return DoesTree1HasTree2(root1.left, root2.left) && DoesTree1HasTree2(root1.right, root2.right);
	}

}
