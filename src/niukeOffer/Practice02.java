package niukeOffer;

/**
 * ��Ŀ��������ʵ��һ����������һ���ַ����е�ÿ���ո��滻�ɡ�%20���� ���磬���ַ���ΪWe Are
 * Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 *
 * @author Shang
 *
 */
public class Practice02 {

	/**
	 * StringBuffer,����ԭ�ַ����������ַ��� ʹ��StringBuffer��append���������µ��ַ�����
	 * 
	 */
	public String replaceSpace(StringBuffer str) {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				result.append("%20");
			} else {
				result.append(str.charAt(i));
			}
		}

		return result.toString();
	}
}
