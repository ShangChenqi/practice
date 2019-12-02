package niukeOffer;

/**
 * ��Ŀ����������һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
 * 
 * @author Shang
 *
 */
public class Practice11 {
	//(n-1)&n�����ܹ�ʹ�Ӷ�����n���ұߵ�1��ʼ��ȫ��Ϊ0
	public int Numberof1(int n) {
		int count = 0;
		while(n != 0) {
			count++;
			n = (n - 1) & n;
		}
		return count;
	}
}
