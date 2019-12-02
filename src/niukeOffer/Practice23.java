package niukeOffer;

/**
 * 题目描述：输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 *
 * @author Shang
 */
public class Practice23 {
    /**
     * 直接执行此方法可能会有问题，因为要求最开始的序列长度不能为0
     */
    public boolean VerifySequenceOfBST(int[] sequence) {
        //若为空或只有一个节点，直接返回true
        if (sequence.length <= 1) {
            return true;
        }

        //先取根结点
        int rootVal = sequence[sequence.length - 1];

        //index划分左右子树
        int index = 0;
        while (sequence[index] < rootVal) {
            index++;
        }

        //判断右子树的值是不是都大于根节点的值
        for (int i = index; i < sequence.length - 1; i++) {
            if (sequence[i] < rootVal)
                return false;
        }

        //创建左子树序列
        int[] leftSequence = new int[index];
        for (int i = 0; i < leftSequence.length; i++) {
            leftSequence[i] = sequence[i];
        }

        //创建右子树序列
        int[] rightSequence = new int[sequence.length - index - 1];
        for (int i = 0; i < rightSequence.length; i++) {
            rightSequence[i] = sequence[index + i];
        }

        return VerifySequenceOfBST(leftSequence) && VerifySequenceOfBST(rightSequence);
    }

}
