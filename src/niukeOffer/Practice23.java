package niukeOffer;

/**
 * ��Ŀ����������һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ��������������Yes,�������No���������������������������ֶ�������ͬ��
 *
 * @author Shang
 */
public class Practice23 {
    /**
     * ֱ��ִ�д˷������ܻ������⣬��ΪҪ���ʼ�����г��Ȳ���Ϊ0
     */
    public boolean VerifySequenceOfBST(int[] sequence) {
        //��Ϊ�ջ�ֻ��һ���ڵ㣬ֱ�ӷ���true
        if (sequence.length <= 1) {
            return true;
        }

        //��ȡ�����
        int rootVal = sequence[sequence.length - 1];

        //index������������
        int index = 0;
        while (sequence[index] < rootVal) {
            index++;
        }

        //�ж���������ֵ�ǲ��Ƕ����ڸ��ڵ��ֵ
        for (int i = index; i < sequence.length - 1; i++) {
            if (sequence[i] < rootVal)
                return false;
        }

        //��������������
        int[] leftSequence = new int[index];
        for (int i = 0; i < leftSequence.length; i++) {
            leftSequence[i] = sequence[i];
        }

        //��������������
        int[] rightSequence = new int[sequence.length - index - 1];
        for (int i = 0; i < rightSequence.length; i++) {
            rightSequence[i] = sequence[index + i];
        }

        return VerifySequenceOfBST(leftSequence) && VerifySequenceOfBST(rightSequence);
    }

}
