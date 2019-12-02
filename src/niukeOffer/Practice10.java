package niukeOffer;

/**
 * ��Ŀ���������ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
 * 
 * @author Shang
 *
 */
public class Practice10 {

	// ����һ��쳲�������������
	public int RectCover(int target) {

		if (target == 0) {
			return 0;
		}

		if (target == 1) {
			return 1;
		}

		if (target == 2) {
			return 2;
		}

		return RectCover(target - 1) + RectCover(target - 2);
	}
}
