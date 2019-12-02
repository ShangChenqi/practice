package niukeOffer;

/**
 * ��Ŀ����������һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η���
 * 
 * @author Shang
 *
 */
public class Practice12 {
	// ����ָ���������͵����Ƿ�Ϊ������
	// ת��Ϊ�����Ƽ�����
	public double Power01(double base, int exponent) {
		double result = 1;
		double current = base;
		int _exponent;
		if (exponent > 0) {
			_exponent = exponent;
		} else if (exponent < 0) {
			if (base == 0) {
				throw new RuntimeException("��������Ϊ0");
			}
			_exponent = -exponent; // ת�������������������ȡ����
		} else {
			return 1;
		}
		while (_exponent != 0) {
			if ((_exponent & 1) == 1) {
				result *= current;
			}
			current *= current;
			_exponent >>= 1;
		}

		return exponent >= 0 ? result : (1 / result);
	}

	//���׵ݹ鷨
	public double Power02(double base, int exponent) {

		return 0;
	}

}
