package niukeOffer;

/**
 * ��Ŀ����������ĳ��������ǰ���������������Ľ�������ؽ����ö�������
 * ���������ǰ���������������Ľ���ж������ظ������֡���������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}�����ؽ������������ء�
 * 
 * @author Shang
 *
 */
public class Practice04 {

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int val) {
			this.val = val;
		}
	}

	/**
	 * 
	 * ����ǰ��������������ƵĻ��и��ݺ���������� ���´���Ϊ�򻯰汾��������reConstructBinaryTree���Ƚ�����
	 */
	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		TreeNode root = reConstructBinaryTree(pre, in, 0, pre.length - 1, 0, in.length - 1);
		return root;
	}

	public TreeNode reConstructBinaryTree(int[] pre, int[] in, int preStart, int preEnd, int inStart, int inEnd) {

		if (preStart > preEnd || inStart > inEnd) {
			return null;
		}

		int rootVal = pre[preStart];
		int rootIndex = inStart;
		while (rootVal != in[rootIndex]) {
			rootIndex++;
		}

		TreeNode treeNode = new TreeNode(rootVal);
		treeNode.left = reConstructBinaryTree(pre, in, preStart + 1, preStart + rootIndex - inStart, inStart,
				rootIndex - 1);
		treeNode.right = reConstructBinaryTree(pre, in, rootIndex - inStart + preStart + 1, preEnd, rootIndex + 1,
				inEnd);

		return treeNode;
	}

}
