package niukeOffer;

/**
 * 题目描述：输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
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
	 * 根据前序和中序建树，类似的还有根据后序和中序建树 以下代码为简化版本，重载了reConstructBinaryTree，比较优雅
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
