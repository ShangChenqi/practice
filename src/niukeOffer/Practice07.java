package niukeOffer;

/**
 * ��Ŀ��������Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n���0��ʼ����0��Ϊ0���� n<=39
 * 
 * @author Shang
 *
 */
public class Practice07 {
	/**
	 * �ݹ�
	 */
	public int Fibonacci01(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return Fibonacci01(n - 1) + Fibonacci01(n - 2);
	}

	/**
	 * ѭ��
	 */
	public int Fibonacci02(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		
		int n1 = 0, n2 = 1;
		int val = 0;
		for(int i = 2; i <= n; i++) {
			val = n1 + n2;
			n1 = n2;
			n2 = val;
		}
		return val;
	}
	
	/**
	 * ��̬�滮
	 */
	public int Fibonacci03(int n) {
		int f = 0, g = 1;
		while(n-- != 0) {
			g += f;
			f = g -f;
		}
		return f;
	}
}
