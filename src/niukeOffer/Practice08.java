package niukeOffer;

/**
 * ��Ŀ������һֻ����һ�ο�������1��̨�ף�Ҳ��������2���������������һ��n����̨���ܹ��ж���������
 */
public class Practice08 {
	//�ݹ�
	public int JumpFloor(int target) {

		if (target == 0) {
			return 1;
		}

		if (target < 0) {
			return 0;
		}

		return JumpFloor(target - 1) + JumpFloor(target - 2);
	}
}
