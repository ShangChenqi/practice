package niukeOffer;

/**
 * ��Ŀ������һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n���������������һ��n����̨���ܹ��ж�����������
 * 
 * @author Shang
 *
 */
public class Practice09 {
	// ��f(n)Ϊ̨����Ϊnʱ��������
	// ��Ȼ f(n) = f(n-1) + f(n-2) + ... + f(1) + f(0) ---------------------1'
	// f(n-1) = f(n-2) + ... + f(1) + f(0) ------------------------------2'
	// ��1��2�� f(n) = 2*f(n-1)
	public int JumpFloorII(int target) {

		if (target <= 0) {
			return 0;
		}

		if (target == 1) {
			return 1;
		}

		return 2 * JumpFloorII(target - 1);
	}
}
