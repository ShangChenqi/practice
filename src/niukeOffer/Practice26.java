package niukeOffer;

/**
 * 题目描述：输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class Practice26 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    TreeNode list = null;   //记录尾结点位置

    //中序遍历 右、中、左。只需要改变一下中序遍历的左右顺序就可以省略很多步骤。
    public TreeNode Convert(TreeNode pRootOfTree) {

        if (pRootOfTree == null) {
            return null;
        }

        Convert(pRootOfTree.right);

        if (list == null) {
            list = pRootOfTree;
        } else {
            list.left = pRootOfTree;
            pRootOfTree.right = list;
            list = pRootOfTree;
        }

        Convert(pRootOfTree.left);

        return list;
    }


}
